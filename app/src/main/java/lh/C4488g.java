package lh;

import Ng.AbstractC1055c0;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.os.Build;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import s0.AbstractC5502d;

/* renamed from: lh.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4488g implements AbstractC4471A {

    /* renamed from: a  reason: collision with root package name */
    public final kh.l f38472a;

    /* renamed from: b  reason: collision with root package name */
    public final kh.c f38473b;

    /* renamed from: c  reason: collision with root package name */
    public final BitmapRegionDecoder f38474c;

    /* renamed from: d  reason: collision with root package name */
    public final x f38475d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC1055c0 f38476e;

    /* renamed from: f  reason: collision with root package name */
    public final long f38477f;

    public C4488g(kh.l lVar, kh.c cVar, BitmapRegionDecoder bitmapRegionDecoder, x xVar, AbstractC1055c0 abstractC1055c0) {
        this.f38472a = lVar;
        this.f38473b = cVar;
        this.f38474c = bitmapRegionDecoder;
        this.f38475d = xVar;
        this.f38476e = abstractC1055c0;
        this.f38477f = e(bitmapRegionDecoder);
    }

    @Override // lh.AbstractC4471A
    public final w a() {
        return this.f38475d.f38521a;
    }

    @Override // lh.AbstractC4471A
    public final void b() {
        this.f38474c.recycle();
        this.f38476e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    @Override // lh.AbstractC4471A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(r rVar, AbstractC4825e abstractC4825e) {
        C4486e c4486e;
        int i10;
        C4488g c4488g;
        r0.z zVar;
        Bitmap.Config config;
        long c10;
        long j6;
        ColorSpace colorSpace;
        if (abstractC4825e instanceof C4486e) {
            c4486e = (C4486e) abstractC4825e;
            int i11 = c4486e.f38468i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4486e.f38468i0 = i11 - Integer.MIN_VALUE;
                Object obj = c4486e.f38466Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4486e.f38468i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4488g = c4486e.f38465Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = rVar.f38503a;
                    kh.c cVar = this.f38473b;
                    int i12 = cVar.f37547a;
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 26 && r0.G.e(i12, 4)) {
                        config = Bitmap.Config.HARDWARE;
                    } else {
                        config = (i13 < 26 || !r0.G.e(i12, 3)) ? r0.G.e(i12, 0) ? Bitmap.Config.ARGB_8888 : r0.G.e(i12, 2) ? Bitmap.Config.RGB_565 : r0.G.e(i12, 1) ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
                    }
                    options.inPreferredConfig = config;
                    if (i13 >= 26) {
                        AbstractC5502d abstractC5502d = cVar.f37548b;
                        if (abstractC5502d != null) {
                            colorSpace = r0.v.a(abstractC5502d);
                        } else {
                            colorSpace = null;
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    int i14 = -this.f38475d.f38521a.f38520Y;
                    Z0.j i15 = Df.H.i(Z0.i.f22797b, e(this.f38474c));
                    float[] fArr = AbstractC4480J.f38451a;
                    Z0.j jVar = rVar.f38504b;
                    AbstractC3557B.c0("<this>", jVar);
                    int i16 = i15.f22803d;
                    int i17 = jVar.f22803d;
                    int i18 = jVar.f22800a;
                    if (i14 != -270) {
                        int i19 = i15.f22802c;
                        int i20 = jVar.f22802c;
                        if (i14 != -180) {
                            int i21 = jVar.f22801b;
                            if (i14 != -90) {
                                if (i14 != 0) {
                                    if (i14 != 90) {
                                        if (i14 != 180) {
                                            if (i14 != 270) {
                                                if (i14 != 360) {
                                                    throw new IllegalStateException(("unsupported orientation = " + i14).toString());
                                                }
                                            }
                                        }
                                    }
                                }
                                c10 = kotlin.jvm.internal.m.c(i18, i21);
                                if (i14 != -270) {
                                    if (i14 != -180) {
                                        if (i14 != -90) {
                                            if (i14 != 0) {
                                                if (i14 != 90) {
                                                    if (i14 != 180) {
                                                        if (i14 != 270) {
                                                            if (i14 != 360) {
                                                                throw new IllegalStateException(("unsupported orientation = " + i14).toString());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            j6 = Ng.H.c(jVar.b(), jVar.a());
                                            C4487f c4487f = new C4487f(this, Df.H.i(c10, j6), options, null);
                                            c4486e.f38465Y = this;
                                            c4486e.f38468i0 = 1;
                                            obj = Ad.l.n1(c4486e, this.f38476e, c4487f);
                                            if (obj == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            c4488g = this;
                                        }
                                        long c11 = Ng.H.c(jVar.b(), jVar.a());
                                        j6 = Ng.H.c((int) (4294967295L & c11), (int) (c11 >> 32));
                                        C4487f c4487f2 = new C4487f(this, Df.H.i(c10, j6), options, null);
                                        c4486e.f38465Y = this;
                                        c4486e.f38468i0 = 1;
                                        obj = Ad.l.n1(c4486e, this.f38476e, c4487f2);
                                        if (obj == enumC5000a) {
                                        }
                                    }
                                    j6 = Ng.H.c(jVar.b(), jVar.a());
                                    C4487f c4487f22 = new C4487f(this, Df.H.i(c10, j6), options, null);
                                    c4486e.f38465Y = this;
                                    c4486e.f38468i0 = 1;
                                    obj = Ad.l.n1(c4486e, this.f38476e, c4487f22);
                                    if (obj == enumC5000a) {
                                    }
                                }
                                long c12 = Ng.H.c(jVar.b(), jVar.a());
                                j6 = Ng.H.c((int) (4294967295L & c12), (int) (c12 >> 32));
                                C4487f c4487f222 = new C4487f(this, Df.H.i(c10, j6), options, null);
                                c4486e.f38465Y = this;
                                c4486e.f38468i0 = 1;
                                obj = Ad.l.n1(c4486e, this.f38476e, c4487f222);
                                if (obj == enumC5000a) {
                                }
                            }
                            long c13 = kotlin.jvm.internal.m.c(i19, i15.f22801b);
                            long c14 = kotlin.jvm.internal.m.c(i20, i21);
                            long c15 = kotlin.jvm.internal.m.c(((int) (c13 >> 32)) - ((int) (c14 >> 32)), ((int) (c13 & 4294967295L)) - ((int) (c14 & 4294967295L)));
                            c10 = kotlin.jvm.internal.m.c(-((int) (AbstractC4480J.a(c15) >> 32)), (int) (AbstractC4480J.a(c15) & 4294967295L));
                            if (i14 != -270) {
                            }
                            long c122 = Ng.H.c(jVar.b(), jVar.a());
                            j6 = Ng.H.c((int) (4294967295L & c122), (int) (c122 >> 32));
                            C4487f c4487f2222 = new C4487f(this, Df.H.i(c10, j6), options, null);
                            c4486e.f38465Y = this;
                            c4486e.f38468i0 = 1;
                            obj = Ad.l.n1(c4486e, this.f38476e, c4487f2222);
                            if (obj == enumC5000a) {
                            }
                        }
                        long c16 = kotlin.jvm.internal.m.c(i19, i16);
                        long c17 = kotlin.jvm.internal.m.c(i20, i17);
                        c10 = kotlin.jvm.internal.m.c(((int) (c16 >> 32)) - ((int) (c17 >> 32)), ((int) (c16 & 4294967295L)) - ((int) (c17 & 4294967295L)));
                        if (i14 != -270) {
                        }
                        long c1222 = Ng.H.c(jVar.b(), jVar.a());
                        j6 = Ng.H.c((int) (4294967295L & c1222), (int) (c1222 >> 32));
                        C4487f c4487f22222 = new C4487f(this, Df.H.i(c10, j6), options, null);
                        c4486e.f38465Y = this;
                        c4486e.f38468i0 = 1;
                        obj = Ad.l.n1(c4486e, this.f38476e, c4487f22222);
                        if (obj == enumC5000a) {
                        }
                    }
                    long c18 = kotlin.jvm.internal.m.c(i15.f22800a, i16);
                    long c19 = kotlin.jvm.internal.m.c(i18, i17);
                    long c20 = kotlin.jvm.internal.m.c(((int) (c18 >> 32)) - ((int) (c19 >> 32)), ((int) (c18 & 4294967295L)) - ((int) (c19 & 4294967295L)));
                    c10 = kotlin.jvm.internal.m.c((int) (AbstractC4480J.a(c20) >> 32), -((int) (AbstractC4480J.a(c20) & 4294967295L)));
                    if (i14 != -270) {
                    }
                    long c12222 = Ng.H.c(jVar.b(), jVar.a());
                    j6 = Ng.H.c((int) (4294967295L & c12222), (int) (c12222 >> 32));
                    C4487f c4487f222222 = new C4487f(this, Df.H.i(c10, j6), options, null);
                    c4486e.f38465Y = this;
                    c4486e.f38468i0 = 1;
                    obj = Ad.l.n1(c4486e, this.f38476e, c4487f222222);
                    if (obj == enumC5000a) {
                    }
                }
                zVar = (r0.z) obj;
                if (zVar == null) {
                    return zVar;
                }
                kh.l lVar = c4488g.f38472a;
                throw new IllegalStateException(("BitmapRegionDecoder returned a null bitmap. Image format may not be supported: " + lVar + Separators.DOT).toString());
            }
        }
        c4486e = new C4486e(this, abstractC4825e);
        Object obj2 = c4486e.f38466Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4486e.f38468i0;
        if (i10 == 0) {
        }
        zVar = (r0.z) obj2;
        if (zVar == null) {
        }
    }

    @Override // lh.AbstractC4471A
    public final long d() {
        return this.f38477f;
    }

    public final long e(BitmapRegionDecoder bitmapRegionDecoder) {
        int i10;
        int i11;
        int ordinal = this.f38475d.f38521a.ordinal();
        boolean z10 = true;
        if (ordinal != 1 && ordinal != 3) {
            z10 = false;
        }
        if (z10) {
            i10 = bitmapRegionDecoder.getHeight();
        } else {
            i10 = bitmapRegionDecoder.getWidth();
        }
        if (z10) {
            i11 = bitmapRegionDecoder.getWidth();
        } else {
            i11 = bitmapRegionDecoder.getHeight();
        }
        return Ng.H.c(i10, i11);
    }
}
