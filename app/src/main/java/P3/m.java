package p3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f42543f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f42544a;

    /* renamed from: b  reason: collision with root package name */
    public int f42545b;

    /* renamed from: c  reason: collision with root package name */
    public int f42546c;

    /* renamed from: d  reason: collision with root package name */
    public int f42547d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f42548e;

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f42544a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f42548e;
        int length = bArr2.length;
        int i13 = this.f42546c;
        if (length < i13 + i12) {
            this.f42548e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f42548e, this.f42546c, i12);
        this.f42546c += i12;
    }
}
