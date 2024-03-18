package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.play_billing.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2479w extends AbstractC2466p implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final MessageDigest f26981Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f26982Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f26983h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f26984i0;

    public C2479w() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f26981Y = messageDigest;
            this.f26982Z = messageDigest.getDigestLength();
            this.f26984i0 = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.f26983h0 = z10;
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        return this.f26984i0;
    }
}
