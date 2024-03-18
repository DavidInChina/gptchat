package j0;

import b0.C2099c;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: j0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3888d extends C3887c {

    /* renamed from: p  reason: collision with root package name */
    public final C3887c f35883p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f35884q;

    public C3888d(int i10, n nVar, wf.k kVar, wf.k kVar2, C3887c c3887c) {
        super(i10, nVar, kVar, kVar2);
        this.f35883p = c3887c;
        c3887c.k();
    }

    @Override // j0.C3887c, j0.AbstractC3893i
    public final void c() {
        if (!this.f35894c) {
            super.c();
            if (!this.f35884q) {
                this.f35884q = true;
                this.f35883p.l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0020, B:14:0x0025, B:17:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x0050, B:27:0x005b, B:28:0x005e, B:30:0x0066, B:31:0x006b, B:33:0x008c, B:34:0x009f, B:35:0x00a2, B:38:0x00b4, B:41:0x00ba, B:42:0x00ca), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0020, B:14:0x0025, B:17:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x0050, B:27:0x005b, B:28:0x005e, B:30:0x0066, B:31:0x006b, B:33:0x008c, B:34:0x009f, B:35:0x00a2, B:38:0x00b4, B:41:0x00ba, B:42:0x00ca), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0020, B:14:0x0025, B:17:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x0050, B:27:0x005b, B:28:0x005e, B:30:0x0066, B:31:0x006b, B:33:0x008c, B:34:0x009f, B:35:0x00a2, B:38:0x00b4, B:41:0x00ba, B:42:0x00ca), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0020, B:14:0x0025, B:17:0x002a, B:21:0x0044, B:23:0x004c, B:24:0x0050, B:27:0x005b, B:28:0x005e, B:30:0x0066, B:31:0x006b, B:33:0x008c, B:34:0x009f, B:35:0x00a2, B:38:0x00b4, B:41:0x00ba, B:42:0x00ca), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    @Override // j0.C3887c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final L4.a v() {
        HashMap hashMap;
        int i10;
        int[] iArr;
        C3887c c3887c = this.f35883p;
        if (!c3887c.f35882n && !c3887c.f35894c) {
            C2099c c2099c = this.f35877i;
            int i11 = this.f35893b;
            if (c2099c != null) {
                hashMap = p.b(c3887c, this, c3887c.e());
            } else {
                hashMap = null;
            }
            synchronized (p.f35918b) {
                try {
                    p.c(this);
                    if (c2099c != null && c2099c.f25558Y != 0) {
                        L4.a x10 = x(this.f35883p.d(), hashMap, this.f35883p.e());
                        if (!AbstractC3557B.K(x10, C3895k.f35897j)) {
                            return x10;
                        }
                        C2099c w10 = this.f35883p.w();
                        if (w10 != null) {
                            w10.r(c2099c);
                        } else {
                            this.f35883p.A(c2099c);
                            this.f35877i = null;
                        }
                        if (this.f35883p.d() < i11) {
                            this.f35883p.u();
                        }
                        C3887c c3887c2 = this.f35883p;
                        c3887c2.r(c3887c2.e().s(i11).r(this.f35879k));
                        this.f35883p.y(i11);
                        C3887c c3887c3 = this.f35883p;
                        i10 = this.f35895d;
                        this.f35895d = -1;
                        if (i10 < 0) {
                            int[] iArr2 = c3887c3.f35880l;
                            AbstractC3557B.c0("<this>", iArr2);
                            int length = iArr2.length;
                            int[] copyOf = Arrays.copyOf(iArr2, length + 1);
                            copyOf[length] = i10;
                            c3887c3.f35880l = copyOf;
                        } else {
                            c3887c3.getClass();
                        }
                        this.f35883p.z(this.f35879k);
                        C3887c c3887c4 = this.f35883p;
                        iArr = this.f35880l;
                        c3887c4.getClass();
                        if (iArr.length == 0) {
                            int[] iArr3 = c3887c4.f35880l;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr, 0, copyOf2, length2, length3);
                                AbstractC3557B.Z(copyOf2);
                                iArr = copyOf2;
                            }
                            c3887c4.f35880l = iArr;
                        }
                        this.f35882n = true;
                        if (!this.f35884q) {
                            this.f35884q = true;
                            this.f35883p.l();
                        }
                        return C3895k.f35897j;
                    }
                    a();
                    if (this.f35883p.d() < i11) {
                    }
                    C3887c c3887c22 = this.f35883p;
                    c3887c22.r(c3887c22.e().s(i11).r(this.f35879k));
                    this.f35883p.y(i11);
                    C3887c c3887c32 = this.f35883p;
                    i10 = this.f35895d;
                    this.f35895d = -1;
                    if (i10 < 0) {
                    }
                    this.f35883p.z(this.f35879k);
                    C3887c c3887c42 = this.f35883p;
                    iArr = this.f35880l;
                    c3887c42.getClass();
                    if (iArr.length == 0) {
                    }
                    this.f35882n = true;
                    if (!this.f35884q) {
                    }
                    return C3895k.f35897j;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new C3894j(this);
    }
}
