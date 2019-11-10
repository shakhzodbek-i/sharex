package com.king.corp.sharex.data;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.auth.PhoneAuthCredential;

public class AuthApi {

    private FirebaseAuth mFirebaseAuth;
    private MutableLiveData<FirebaseUser> mCurrentUser;

    public AuthApi(FirebaseAuth mFirebaseAuth) {
        this.mFirebaseAuth = mFirebaseAuth;
        this.mCurrentUser = new MutableLiveData<>();
    }

    public void loginByPhone(PhoneAuthCredential credential) {

        mFirebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mCurrentUser.postValue(task.getResult().getUser());
                        } else {
                            mCurrentUser.postValue(null);
                        }
                    }
                });
    }

    public void loginByGoogle(GoogleSignInAccount account) {
        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
        mFirebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mCurrentUser.postValue(mFirebaseAuth.getCurrentUser());
                        } else {
                            mCurrentUser.postValue(null);
                        }
                    }
                });
    }
}
