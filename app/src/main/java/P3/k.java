package p3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f42521e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f42522a;

    /* renamed from: b  reason: collision with root package name */
    public int f42523b;

    /* renamed from: c  reason: collision with root package name */
    public int f42524c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f42525d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f42522a) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f42525d;
        int length = bArr2.length;
        int i13 = this.f42523b;
        if (length < i13 + i12) {
            this.f42525d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f42525d, this.f42523b, i12);
        this.f42523b += i12;
    }
}
