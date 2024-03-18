package com.pairip;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class SignatureCheck {
    private static final String ALLOWLISTED_SIG = "Vn3kj4pUblROi2S+QfRRL9nhsaO2uoHQg6+dpEtxdTE=";
    private static final String TAG = "SignatureCheck";
    private static String expectedLegacyUpgradedSignature = "sk9L+7PPKT+ThwO52HAnwRAsw23E+iBpEOCJJ9tARzw=";
    private static String expectedSignature = "sk9L+7PPKT+ThwO52HAnwRAsw23E+iBpEOCJJ9tARzw=";
    private static String expectedTestSignature = "sk9L+7PPKT+ThwO52HAnwRAsw23E+iBpEOCJJ9tARzw=";

    /* loaded from: classes2.dex */
    private static class SignatureTamperedException extends RuntimeException {
        public SignatureTamperedException(String message) {
            super(message);
        }
    }

    public static void verifyIntegrity(Context context) {
        String str;
        try {
            str = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()), 2);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            str = null;
        }
        if (!verifySignatureMatches(str) && !expectedTestSignature.equals(str) && !ALLOWLISTED_SIG.equals(str)) {
            throw new SignatureTamperedException("Apk signature is invalid.");
        }
        Log.i(TAG, "Signature check ok");
    }

    public static boolean verifySignatureMatches(String signature) {
        return expectedSignature.equals(signature) || expectedLegacyUpgradedSignature.equals(signature);
    }

    private SignatureCheck() {
    }
}
