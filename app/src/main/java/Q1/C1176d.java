package Q1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: Q1.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1176d extends C1175c {
    @Override // P5.c
    public final Signature[] F(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
