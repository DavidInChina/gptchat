package nh;

import Df.H;
import K4.J;
import Z.C1724m0;
import Z.o1;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.play_billing.N;
import fi.C3100a;
import g4.C3185m;
import i4.AbstractC3470c;
import i4.C3473f;
import i4.m;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import ji.C4113B;
import ji.C4138m;
import mh.AbstractC4658C;
import mh.C4659D;
import mh.C4660E;
import mh.C4661F;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import oh.n;
import q4.q;
import r0.C5341e;
import r0.v;
import s0.AbstractC5502d;
import t4.C5673a;

/* renamed from: nh.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4858h extends n {

    /* renamed from: Z  reason: collision with root package name */
    public final q4.j f40384Z;

    /* renamed from: h0  reason: collision with root package name */
    public final f4.i f40385h0;

    /* renamed from: i0  reason: collision with root package name */
    public final r4.i f40386i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1724m0 f40387j0 = AbstractC4828h.Z(new C4660E(null, 0, null), o1.f22665a);

    public C4858h(q4.j jVar, f4.i iVar, C4852b c4852b) {
        AbstractC3557B.c0("imageLoader", iVar);
        this.f40384Z = jVar;
        this.f40385h0 = iVar;
        this.f40386i0 = c4852b;
        Mg.a aVar = Mg.b.f12127Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
        if (r13 == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    @Override // oh.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        C4857g c4857g;
        EnumC5000a enumC5000a;
        int i10;
        q4.k kVar;
        C4858h c4858h;
        boolean z10;
        long j6;
        AbstractC4658C abstractC4658C;
        Drawable a5;
        Z6.a aVar;
        AbstractC5502d abstractC5502d;
        ColorSpace colorSpace;
        Bitmap.Config config;
        Bitmap.Config config2;
        C4858h c4858h2;
        Object e10;
        q4.b bVar;
        if (abstractC4825e instanceof C4857g) {
            c4857g = (C4857g) abstractC4825e;
            int i11 = c4857g.f40383j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4857g.f40383j0 = i11 - Integer.MIN_VALUE;
                Object obj = c4857g.f40381h0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c4857g.f40383j0;
                int i12 = 3;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kVar = c4857g.f40380Z;
                            c4858h = c4857g.f40379Y;
                            N.B0(obj);
                            kh.l lVar = (kh.l) obj;
                            C4660E c4660e = (C4660E) c4858h.f40387j0.getValue();
                            t4.e eVar = kVar.b().f43854m;
                            z10 = kVar instanceof q;
                            if (!z10 && (eVar instanceof C5673a)) {
                                Mg.a aVar2 = Mg.b.f12127Z;
                                j6 = H.x0(((C5673a) eVar).f45740b, Mg.d.f12133h0);
                            } else {
                                Mg.a aVar3 = Mg.b.f12127Z;
                                j6 = 0;
                            }
                            if (!z10 && lVar != null) {
                                Drawable drawable = ((q) kVar).f43886a;
                                AbstractC3557B.a0("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable", drawable);
                                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                                AbstractC3557B.b0("getBitmap(...)", bitmap);
                                Bitmap.Config config3 = bitmap.getConfig();
                                AbstractC3557B.b0("getConfig(...)", config3);
                                int i13 = Build.VERSION.SDK_INT;
                                if (i13 >= 26) {
                                    config2 = Bitmap.Config.HARDWARE;
                                    if (config3 == config2) {
                                        i12 = 4;
                                        if (i13 < 26 && colorSpace != null) {
                                            abstractC5502d = v.b(colorSpace);
                                        } else {
                                            abstractC5502d = null;
                                        }
                                        abstractC4658C = new C4661F(lVar, new kh.c(i12, abstractC5502d));
                                    }
                                }
                                if (i13 >= 26) {
                                    config = Bitmap.Config.RGBA_F16;
                                }
                                i12 = 0;
                                if (config3 != Bitmap.Config.ARGB_8888) {
                                    if (config3 == Bitmap.Config.RGB_565) {
                                        i12 = 2;
                                    } else if (config3 == Bitmap.Config.ALPHA_8) {
                                        i12 = 1;
                                    }
                                }
                                if (i13 < 26) {
                                    colorSpace = bitmap.getColorSpace();
                                }
                                abstractC5502d = null;
                                abstractC4658C = new C4661F(lVar, new kh.c(i12, abstractC5502d));
                            } else {
                                a5 = kVar.a();
                                if (a5 == null) {
                                    Drawable mutate = a5.mutate();
                                    AbstractC3557B.b0("mutate(...)", mutate);
                                    aVar = new Z6.a(mutate);
                                } else {
                                    aVar = null;
                                }
                                abstractC4658C = new C4659D(aVar);
                            }
                            c4858h.f40387j0.setValue(P4.a.z(c4660e, abstractC4658C, j6, null, 4));
                            return y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4858h2 = c4857g.f40379Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    q4.j jVar = this.f40384Z;
                    q4.h a10 = q4.j.a(jVar);
                    r4.i iVar = jVar.f43840L.f43769b;
                    if (iVar == null) {
                        iVar = this.f40386i0;
                    }
                    a10.f43798K = iVar;
                    a10.b();
                    int ordinal = jVar.f43862u.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                throw new RuntimeException();
                            }
                            bVar = q4.b.f43748i0;
                        } else {
                            bVar = q4.b.f43747h0;
                        }
                    } else {
                        bVar = q4.b.f43747h0;
                    }
                    a10.f43824v = bVar;
                    a10.f43806d = new C3185m(this, 1);
                    a10.b();
                    q4.j a11 = a10.a();
                    c4857g.f40379Y = this;
                    c4857g.f40383j0 = 1;
                    obj = ((f4.q) this.f40385h0).b(a11, c4857g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4858h2 = this;
                }
                q4.k kVar2 = (q4.k) obj;
                c4857g.f40379Y = c4858h2;
                c4857g.f40380Z = kVar2;
                c4857g.f40383j0 = 2;
                e10 = c4858h2.e(kVar2, c4857g);
                if (e10 != enumC5000a) {
                    return enumC5000a;
                }
                kVar = kVar2;
                obj = e10;
                c4858h = c4858h2;
                kh.l lVar2 = (kh.l) obj;
                C4660E c4660e2 = (C4660E) c4858h.f40387j0.getValue();
                t4.e eVar2 = kVar.b().f43854m;
                z10 = kVar instanceof q;
                if (!z10) {
                }
                Mg.a aVar32 = Mg.b.f12127Z;
                j6 = 0;
                if (!z10) {
                }
                a5 = kVar.a();
                if (a5 == null) {
                }
                abstractC4658C = new C4659D(aVar);
                c4858h.f40387j0.setValue(P4.a.z(c4660e2, abstractC4658C, j6, null, 4));
                return y.f36177a;
            }
        }
        c4857g = new C4857g(this, abstractC4825e);
        Object obj2 = c4857g.f40381h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c4857g.f40383j0;
        int i122 = 3;
        if (i10 == 0) {
        }
        q4.k kVar22 = (q4.k) obj2;
        c4857g.f40379Y = c4858h2;
        c4857g.f40380Z = kVar22;
        c4857g.f40383j0 = 2;
        e10 = c4858h2.e(kVar22, c4857g);
        if (e10 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(q4.k kVar, AbstractC4825e abstractC4825e) {
        C4856f c4856f;
        int i10;
        boolean z10;
        kh.l lVar;
        kh.l lVar2;
        C4858h c4858h;
        AbstractC4854d abstractC4854d;
        BitmapDrawable bitmapDrawable;
        C5341e c5341e;
        Bitmap bitmap;
        Uri uri;
        C4855e c4855e;
        C4113B c4113b;
        C.b bVar;
        String path;
        String path2;
        List<String> pathSegments;
        m mVar;
        if (abstractC4825e instanceof C4856f) {
            c4856f = (C4856f) abstractC4825e;
            int i11 = c4856f.f40378i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4856f.f40378i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4856f.f40376Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4856f.f40378i0;
                z10 = false;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            lVar2 = (kh.l) c4856f.f40375Y;
                            N.B0(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                lVar = lVar2;
                                z10 = true;
                            } else {
                                lVar = lVar2;
                            }
                            if (!z10) {
                                return null;
                            }
                            return lVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4858h = (C4858h) c4856f.f40375Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    if (!(kVar instanceof q)) {
                        return null;
                    }
                    q qVar = (q) kVar;
                    if (!(qVar.f43886a instanceof BitmapDrawable)) {
                        return null;
                    }
                    String str = qVar.f43890e;
                    if (str != null) {
                        AbstractC3470c abstractC3470c = (AbstractC3470c) ((f4.q) this.f40385h0).f29635d.getValue();
                        AbstractC3557B.Z(abstractC3470c);
                        AbstractC3557B.Z(str);
                        C4138m c4138m = C4138m.f36722i0;
                        C3473f j6 = ((i4.n) abstractC3470c).f32704b.j(ei.l.g(str).c("SHA-256").e());
                        if (j6 != null) {
                            mVar = new m(j6);
                        } else {
                            mVar = null;
                        }
                        if (mVar != null) {
                            abstractC4854d = new C.b(3, mVar);
                        } else {
                            throw new IllegalStateException("Coil returned a null cache snapshot".toString());
                        }
                    } else {
                        h4.f fVar = h4.f.f31881h0;
                        h4.f fVar2 = qVar.f43888c;
                        if (fVar2 != fVar && fVar2 != h4.f.f31879Y) {
                            return null;
                        }
                        Object obj2 = kVar.b().f43843b;
                        if (obj2 instanceof String) {
                            uri = Uri.parse((String) obj2);
                        } else if (obj2 instanceof Uri) {
                            uri = (Uri) obj2;
                        } else {
                            uri = null;
                        }
                        if (uri != null) {
                            String h10 = J.h(uri);
                            if (h10 != null) {
                                bVar = new C.b(0, h10);
                            } else {
                                if (uri.getScheme() == null && (path2 = uri.getPath()) != null && Lg.n.J2(path2, '/')) {
                                    AbstractC3557B.b0("getPathSegments(...)", uri.getPathSegments());
                                    if (!pathSegments.isEmpty()) {
                                        String str2 = C4113B.f36660Z;
                                        String uri2 = uri.toString();
                                        AbstractC3557B.b0("toString(...)", uri2);
                                        c4113b = C3100a.f(uri2, false);
                                        if (c4113b == null) {
                                            bVar = new C.b(1, c4113b);
                                        } else {
                                            abstractC4854d = new C.b(2, uri);
                                        }
                                    }
                                }
                                if (AbstractC3557B.K(uri.getScheme(), "file") && (path = uri.getPath()) != null) {
                                    String str3 = C4113B.f36660Z;
                                    c4113b = C3100a.f(path, false);
                                } else {
                                    c4113b = null;
                                }
                                if (c4113b == null) {
                                }
                            }
                            abstractC4854d = bVar;
                        } else {
                            if (obj2 instanceof Integer) {
                                try {
                                    int intValue = ((Number) obj2).intValue();
                                    this.f40384Z.f43842a.getResources().getResourceEntryName(intValue);
                                    c4855e = new C4855e(intValue);
                                } catch (Throwable th2) {
                                    N.w(th2);
                                }
                                if (c4855e != null) {
                                    return null;
                                }
                                abstractC4854d = new Ii.q(c4855e.f40374a);
                            }
                            c4855e = null;
                            if (c4855e != null) {
                            }
                        }
                    }
                    Drawable drawable = qVar.f43886a;
                    if (drawable instanceof BitmapDrawable) {
                        bitmapDrawable = (BitmapDrawable) drawable;
                    } else {
                        bitmapDrawable = null;
                    }
                    if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                        c5341e = new C5341e(bitmap);
                    } else {
                        c5341e = null;
                    }
                    c4856f.f40375Y = this;
                    c4856f.f40378i0 = 1;
                    obj = abstractC4854d.b(c5341e);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    c4858h = this;
                }
                lVar = (kh.l) obj;
                if (lVar != null) {
                    c4856f.f40375Y = lVar;
                    c4856f.f40378i0 = 2;
                    Object O10 = R4.b.O(c4858h, lVar, c4856f);
                    if (O10 == enumC5000a) {
                        return enumC5000a;
                    }
                    obj = O10;
                    lVar2 = lVar;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
                if (!z10) {
                }
            }
        }
        c4856f = new C4856f(this, abstractC4825e);
        Object obj3 = c4856f.f40376Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4856f.f40378i0;
        z10 = false;
        if (i10 == 0) {
        }
        lVar = (kh.l) obj3;
        if (lVar != null) {
        }
        if (!z10) {
        }
    }
}
