package t7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f45788c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f45788c = bArr;
    }

    @Override // t7.n
    public final byte[] m() {
        return this.f45788c;
    }
}
