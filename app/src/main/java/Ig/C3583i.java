package ig;

import androidx.glance.appwidget.protobuf.AbstractC2041a;
import fg.C3033a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lg.AbstractC4460e;
import lg.AbstractC4466k;
import lg.C4459d;
import lg.C4461f;
import lg.C4462g;
import lg.p;
import lg.t;
import lg.w;

/* renamed from: ig.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3583i extends p {

    /* renamed from: r0  reason: collision with root package name */
    public static final C3583i f33210r0;

    /* renamed from: s0  reason: collision with root package name */
    public static final C3033a f33211s0 = new C3033a(28);

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC4460e f33212Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33213Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33214h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33215i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f33216j0;

    /* renamed from: k0  reason: collision with root package name */
    public EnumC3582h f33217k0;

    /* renamed from: l0  reason: collision with root package name */
    public List f33218l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f33219m0;

    /* renamed from: n0  reason: collision with root package name */
    public List f33220n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f33221o0;

    /* renamed from: p0  reason: collision with root package name */
    public byte f33222p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f33223q0;

    static {
        C3583i c3583i = new C3583i();
        f33210r0 = c3583i;
        c3583i.f33214h0 = 1;
        c3583i.f33215i0 = 0;
        c3583i.f33216j0 = "";
        c3583i.f33217k0 = EnumC3582h.NONE;
        c3583i.f33218l0 = Collections.emptyList();
        c3583i.f33220n0 = Collections.emptyList();
    }

    public C3583i() {
        this.f33219m0 = -1;
        this.f33221o0 = -1;
        this.f33222p0 = (byte) -1;
        this.f33223q0 = -1;
        this.f33212Y = AbstractC4460e.f38378Y;
    }

    @Override // lg.AbstractC4456a
    public final int a() {
        int i10;
        AbstractC4460e abstractC4460e;
        int i11 = this.f33223q0;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f33213Z & 1) == 1) {
            i10 = C4462g.b(1, this.f33214h0);
        } else {
            i10 = 0;
        }
        if ((this.f33213Z & 2) == 2) {
            i10 += C4462g.b(2, this.f33215i0);
        }
        if ((this.f33213Z & 8) == 8) {
            i10 += C4462g.a(3, this.f33217k0.f33209Y);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f33218l0.size(); i13++) {
            i12 += C4462g.c(((Integer) this.f33218l0.get(i13)).intValue());
        }
        int i14 = i10 + i12;
        if (!this.f33218l0.isEmpty()) {
            i14 = i14 + 1 + C4462g.c(i12);
        }
        this.f33219m0 = i12;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f33220n0.size(); i16++) {
            i15 += C4462g.c(((Integer) this.f33220n0.get(i16)).intValue());
        }
        int i17 = i14 + i15;
        if (!this.f33220n0.isEmpty()) {
            i17 = i17 + 1 + C4462g.c(i15);
        }
        this.f33221o0 = i15;
        if ((this.f33213Z & 4) == 4) {
            Object obj = this.f33216j0;
            if (obj instanceof String) {
                try {
                    abstractC4460e = new w(((String) obj).getBytes("UTF-8"));
                    this.f33216j0 = abstractC4460e;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                abstractC4460e = (AbstractC4460e) obj;
            }
            i17 += abstractC4460e.size() + C4462g.f(abstractC4460e.size()) + C4462g.h(6);
        }
        int size = this.f33212Y.size() + i17;
        this.f33223q0 = size;
        return size;
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a b() {
        return C3581g.e();
    }

    @Override // lg.AbstractC4456a
    public final AbstractC2041a c() {
        C3581g e10 = C3581g.e();
        e10.f(this);
        return e10;
    }

    @Override // lg.AbstractC4456a
    public final void d(C4462g c4462g) {
        AbstractC4460e abstractC4460e;
        a();
        if ((this.f33213Z & 1) == 1) {
            c4462g.m(1, this.f33214h0);
        }
        if ((this.f33213Z & 2) == 2) {
            c4462g.m(2, this.f33215i0);
        }
        if ((this.f33213Z & 8) == 8) {
            c4462g.l(3, this.f33217k0.f33209Y);
        }
        if (this.f33218l0.size() > 0) {
            c4462g.v(34);
            c4462g.v(this.f33219m0);
        }
        for (int i10 = 0; i10 < this.f33218l0.size(); i10++) {
            c4462g.n(((Integer) this.f33218l0.get(i10)).intValue());
        }
        if (this.f33220n0.size() > 0) {
            c4462g.v(42);
            c4462g.v(this.f33221o0);
        }
        for (int i11 = 0; i11 < this.f33220n0.size(); i11++) {
            c4462g.n(((Integer) this.f33220n0.get(i11)).intValue());
        }
        if ((this.f33213Z & 4) == 4) {
            Object obj = this.f33216j0;
            if (obj instanceof String) {
                try {
                    abstractC4460e = new w(((String) obj).getBytes("UTF-8"));
                    this.f33216j0 = abstractC4460e;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                abstractC4460e = (AbstractC4460e) obj;
            }
            c4462g.x(6, 2);
            c4462g.v(abstractC4460e.size());
            c4462g.r(abstractC4460e);
        }
        c4462g.r(this.f33212Y);
    }

    @Override // lg.x
    public final boolean isInitialized() {
        byte b10 = this.f33222p0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f33222p0 = (byte) 1;
        return true;
    }

    public C3583i(C4461f c4461f) {
        EnumC3582h enumC3582h;
        this.f33219m0 = -1;
        this.f33221o0 = -1;
        this.f33222p0 = (byte) -1;
        this.f33223q0 = -1;
        this.f33214h0 = 1;
        boolean z10 = false;
        this.f33215i0 = 0;
        this.f33216j0 = "";
        EnumC3582h enumC3582h2 = EnumC3582h.NONE;
        this.f33217k0 = enumC3582h2;
        this.f33218l0 = Collections.emptyList();
        this.f33220n0 = Collections.emptyList();
        C4459d c4459d = new C4459d();
        C4462g j6 = C4462g.j(c4459d, 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = c4461f.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f33213Z |= 1;
                            this.f33214h0 = c4461f.k();
                        } else if (n10 == 16) {
                            this.f33213Z |= 2;
                            this.f33215i0 = c4461f.k();
                        } else if (n10 == 24) {
                            int k10 = c4461f.k();
                            if (k10 == 0) {
                                enumC3582h = enumC3582h2;
                            } else if (k10 != 1) {
                                enumC3582h = k10 != 2 ? null : EnumC3582h.DESC_TO_CLASS_ID;
                            } else {
                                enumC3582h = EnumC3582h.INTERNAL_TO_CLASS_ID;
                            }
                            if (enumC3582h == null) {
                                j6.v(n10);
                                j6.v(k10);
                            } else {
                                this.f33213Z |= 8;
                                this.f33217k0 = enumC3582h;
                            }
                        } else if (n10 == 32) {
                            if (!(z11 & true)) {
                                this.f33218l0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f33218l0.add(Integer.valueOf(c4461f.k()));
                        } else if (n10 == 34) {
                            int d10 = c4461f.d(c4461f.k());
                            if (!(z11 & true) && c4461f.b() > 0) {
                                this.f33218l0 = new ArrayList();
                                z11 |= true;
                            }
                            while (c4461f.b() > 0) {
                                this.f33218l0.add(Integer.valueOf(c4461f.k()));
                            }
                            c4461f.c(d10);
                        } else if (n10 == 40) {
                            if (!(z11 & true)) {
                                this.f33220n0 = new ArrayList();
                                z11 |= true;
                            }
                            this.f33220n0.add(Integer.valueOf(c4461f.k()));
                        } else if (n10 == 42) {
                            int d11 = c4461f.d(c4461f.k());
                            if (!(z11 & true) && c4461f.b() > 0) {
                                this.f33220n0 = new ArrayList();
                                z11 |= true;
                            }
                            while (c4461f.b() > 0) {
                                this.f33220n0.add(Integer.valueOf(c4461f.k()));
                            }
                            c4461f.c(d11);
                        } else if (n10 != 50) {
                            if (!c4461f.q(n10, j6)) {
                            }
                        } else {
                            w e10 = c4461f.e();
                            this.f33213Z |= 4;
                            this.f33216j0 = e10;
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f33218l0 = Collections.unmodifiableList(this.f33218l0);
                    }
                    if (z11 & true) {
                        this.f33220n0 = Collections.unmodifiableList(this.f33220n0);
                    }
                    try {
                        j6.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f33212Y = c4459d.i();
                        throw th3;
                    }
                    this.f33212Y = c4459d.i();
                    throw th2;
                }
            } catch (t e11) {
                e11.f38415Y = this;
                throw e11;
            } catch (IOException e12) {
                t tVar = new t(e12.getMessage());
                tVar.f38415Y = this;
                throw tVar;
            }
        }
        if (z11 & true) {
            this.f33218l0 = Collections.unmodifiableList(this.f33218l0);
        }
        if (z11 & true) {
            this.f33220n0 = Collections.unmodifiableList(this.f33220n0);
        }
        try {
            j6.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f33212Y = c4459d.i();
            throw th4;
        }
        this.f33212Y = c4459d.i();
    }

    public C3583i(AbstractC4466k abstractC4466k) {
        this.f33219m0 = -1;
        this.f33221o0 = -1;
        this.f33222p0 = (byte) -1;
        this.f33223q0 = -1;
        this.f33212Y = abstractC4466k.f38400Y;
    }
}
