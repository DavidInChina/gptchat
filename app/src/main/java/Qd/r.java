package Qd;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class r extends IOException {

    /* renamed from: Y  reason: collision with root package name */
    public final int f14649Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(int i10, String str, String str2) {
        super(r0.toString());
        StringBuilder sb2 = new StringBuilder("HTTP ");
        sb2.append(i10);
        sb2.append(": ");
        sb2.append(str);
        sb2.append(". Response: ");
        sb2.append(str2 == null ? "No response" : str2);
        this.f14649Y = i10;
    }
}
