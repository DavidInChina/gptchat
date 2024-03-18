package oe;

import id.AbstractC3557B;

/* renamed from: oe.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4992a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4992a(IllegalAccessException illegalAccessException, int i10) {
        super(illegalAccessException);
        if (i10 != 7) {
        } else {
            super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4992a(String str, int i10) {
        super(str);
        if (i10 == 1) {
            AbstractC3557B.c0("value", str);
            super("Bad Content-Type format: ".concat(str));
        } else if (i10 == 2) {
            AbstractC3557B.c0("message", str);
            super(str);
        } else if (i10 == 3) {
            AbstractC3557B.c0("message", str);
            super(str);
        } else if (i10 != 4) {
            AbstractC3557B.c0("message", str);
        } else {
            AbstractC3557B.c0("message", str);
            super(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4992a(String str, int i10, int i11) {
        this(android.gov.nist.core.a.l(r0, i11, " bytes."), 3);
        StringBuilder sb2 = new StringBuilder("Not enough free space to write ");
        sb2.append(str);
        sb2.append(" of ");
        sb2.append(i10);
        sb2.append(" bytes, available ");
    }
}
