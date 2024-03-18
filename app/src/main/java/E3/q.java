package e3;

import L2.F;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28914a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28915b;

    /* renamed from: c  reason: collision with root package name */
    public final F f28916c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28917d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f28918e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r6.equals("cbc1") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        boolean z12;
        char c10 = 0;
        int i13 = 1;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bArr2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        Gi.e.l(z11 ^ z12);
        this.f28914a = z10;
        this.f28915b = str;
        this.f28917d = i10;
        this.f28918e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c10 = 1;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c10 = 2;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c10 = 3;
                        break;
                    }
                    c10 = '\uffff';
                    break;
                default:
                    c10 = '\uffff';
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i13 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    s2.p.g("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f28916c = new F(i13, i11, i12, bArr);
    }
}
