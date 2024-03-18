package x4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import y.AbstractC6463a;
import y4.AbstractC6541a;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class m implements l, AbstractC6541a, c {

    /* renamed from: e  reason: collision with root package name */
    public final v4.l f48845e;

    /* renamed from: f  reason: collision with root package name */
    public final int f48846f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f48847g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f48848h;

    /* renamed from: i  reason: collision with root package name */
    public final y4.h f48849i;

    /* renamed from: j  reason: collision with root package name */
    public final y4.e f48850j;

    /* renamed from: k  reason: collision with root package name */
    public final y4.h f48851k;

    /* renamed from: l  reason: collision with root package name */
    public final y4.h f48852l;

    /* renamed from: m  reason: collision with root package name */
    public final y4.h f48853m;

    /* renamed from: n  reason: collision with root package name */
    public final y4.h f48854n;

    /* renamed from: o  reason: collision with root package name */
    public final y4.h f48855o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f48857q;

    /* renamed from: a  reason: collision with root package name */
    public final Path f48841a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Path f48842b = new Path();

    /* renamed from: c  reason: collision with root package name */
    public final PathMeasure f48843c = new PathMeasure();

    /* renamed from: d  reason: collision with root package name */
    public final float[] f48844d = new float[2];

    /* renamed from: p  reason: collision with root package name */
    public final Q3.j f48856p = new Q3.j(1);

    public m(v4.l lVar, E4.b bVar, D4.h hVar) {
        this.f48845e = lVar;
        hVar.getClass();
        int i10 = hVar.f3372a;
        this.f48846f = i10;
        this.f48847g = hVar.f3380i;
        this.f48848h = hVar.f3381j;
        y4.e s10 = hVar.f3373b.s();
        this.f48849i = (y4.h) s10;
        y4.e s11 = hVar.f3374c.s();
        this.f48850j = s11;
        y4.e s12 = hVar.f3375d.s();
        this.f48851k = (y4.h) s12;
        y4.e s13 = hVar.f3377f.s();
        this.f48853m = (y4.h) s13;
        y4.e s14 = hVar.f3379h.s();
        this.f48855o = (y4.h) s14;
        if (i10 == 1) {
            this.f48852l = (y4.h) hVar.f3376e.s();
            this.f48854n = (y4.h) hVar.f3378g.s();
        } else {
            this.f48852l = null;
            this.f48854n = null;
        }
        bVar.d(s10);
        bVar.d(s11);
        bVar.d(s12);
        bVar.d(s13);
        bVar.d(s14);
        if (i10 == 1) {
            bVar.d(this.f48852l);
            bVar.d(this.f48854n);
        }
        s10.a(this);
        s11.a(this);
        s12.a(this);
        s13.a(this);
        s14.a(this);
        if (i10 == 1) {
            this.f48852l.a(this);
            this.f48854n.a(this);
        }
    }

    @Override // y4.AbstractC6541a
    public final void a() {
        this.f48857q = false;
        this.f48845e.invalidateSelf();
    }

    @Override // x4.c
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                c cVar = (c) arrayList.get(i10);
                if (cVar instanceof s) {
                    s sVar = (s) cVar;
                    if (sVar.f48890c == 1) {
                        this.f48856p.f14418b.add(sVar);
                        sVar.d(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // x4.l
    public final Path f() {
        float f6;
        float f10;
        float f11;
        double d10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        double d11;
        float f29;
        int i10;
        boolean z10 = this.f48857q;
        Path path = this.f48841a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f48847g) {
            this.f48857q = true;
            return path;
        }
        int f30 = AbstractC6708l.f(this.f48846f);
        y4.e eVar = this.f48850j;
        y4.h hVar = this.f48853m;
        y4.h hVar2 = this.f48855o;
        double d12 = 0.0d;
        y4.h hVar3 = this.f48851k;
        y4.h hVar4 = this.f48849i;
        if (f30 != 0) {
            if (f30 == 1) {
                int floor = (int) Math.floor(((Float) hVar4.d()).floatValue());
                if (hVar3 != null) {
                    d12 = ((Float) hVar3.d()).floatValue();
                }
                double radians = Math.toRadians(d12 - 90.0d);
                double d13 = floor;
                float floatValue = ((Float) hVar2.d()).floatValue() / 100.0f;
                float floatValue2 = ((Float) hVar.d()).floatValue();
                double d14 = floatValue2;
                float cos = (float) (Math.cos(radians) * d14);
                float sin = (float) (Math.sin(radians) * d14);
                path.moveTo(cos, sin);
                double d15 = (float) (6.283185307179586d / d13);
                double ceil = Math.ceil(d13);
                double d16 = radians + d15;
                int i11 = 0;
                while (true) {
                    double d17 = i11;
                    if (d17 >= ceil) {
                        break;
                    }
                    float cos2 = (float) (Math.cos(d16) * d14);
                    double d18 = d15;
                    float sin2 = (float) (Math.sin(d16) * d14);
                    if (floatValue != 0.0f) {
                        d11 = d14;
                        double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                        i10 = i11;
                        float f31 = cos;
                        double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                        float f32 = floatValue2 * floatValue * 0.25f;
                        float cos3 = ((float) Math.cos(atan2)) * f32;
                        float sin3 = ((float) Math.sin(atan2)) * f32;
                        float cos4 = ((float) Math.cos(atan22)) * f32;
                        float sin4 = f32 * ((float) Math.sin(atan22));
                        if (d17 == ceil - 1.0d) {
                            Path path2 = this.f48842b;
                            path2.reset();
                            path2.moveTo(f31, sin);
                            float f33 = f31 - cos3;
                            float f34 = sin - sin3;
                            float f35 = cos4 + cos2;
                            float f36 = sin2 + sin4;
                            path2.cubicTo(f33, f34, f35, f36, cos2, sin2);
                            PathMeasure pathMeasure = this.f48843c;
                            pathMeasure.setPath(path2, false);
                            f29 = floatValue2;
                            float[] fArr = this.f48844d;
                            pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, fArr, null);
                            path.cubicTo(f33, f34, f35, f36, fArr[0], fArr[1]);
                        } else {
                            f29 = floatValue2;
                            path.cubicTo(f31 - cos3, sin - sin3, cos2 + cos4, sin2 + sin4, cos2, sin2);
                        }
                    } else {
                        i10 = i11;
                        d11 = d14;
                        f29 = floatValue2;
                        if (d17 != ceil - 1.0d) {
                            path.lineTo(cos2, sin2);
                        } else {
                            i11 = i10 + 1;
                            cos = cos2;
                            sin = sin2;
                            floatValue2 = f29;
                            d14 = d11;
                            d15 = d18;
                        }
                    }
                    d16 += d18;
                    i11 = i10 + 1;
                    cos = cos2;
                    sin = sin2;
                    floatValue2 = f29;
                    d14 = d11;
                    d15 = d18;
                }
                PointF pointF = (PointF) eVar.d();
                path.offset(pointF.x, pointF.y);
                path.close();
            }
        } else {
            float floatValue3 = ((Float) hVar4.d()).floatValue();
            if (hVar3 != null) {
                d12 = ((Float) hVar3.d()).floatValue();
            }
            double radians2 = Math.toRadians(d12 - 90.0d);
            double d19 = floatValue3;
            float f37 = (float) (6.283185307179586d / d19);
            if (this.f48848h) {
                f37 *= -1.0f;
            }
            float f38 = f37;
            float f39 = 2.0f;
            float f40 = f38 / 2.0f;
            float f41 = floatValue3 - ((int) floatValue3);
            int i12 = (f41 > 0.0f ? 1 : (f41 == 0.0f ? 0 : -1));
            if (i12 != 0) {
                radians2 += (1.0f - f41) * f40;
            }
            float floatValue4 = ((Float) hVar.d()).floatValue();
            float floatValue5 = ((Float) this.f48852l.d()).floatValue();
            y4.h hVar5 = this.f48854n;
            if (hVar5 != null) {
                f6 = ((Float) hVar5.d()).floatValue() / 100.0f;
            } else {
                f6 = 0.0f;
            }
            if (hVar2 != null) {
                f10 = ((Float) hVar2.d()).floatValue() / 100.0f;
            } else {
                f10 = 0.0f;
            }
            if (i12 != 0) {
                float d20 = AbstractC6463a.d(floatValue4, floatValue5, f41, floatValue5);
                double d21 = d20;
                f11 = d20;
                f13 = (float) (Math.cos(radians2) * d21);
                f12 = (float) (Math.sin(radians2) * d21);
                path.moveTo(f13, f12);
                d10 = radians2 + ((f38 * f41) / 2.0f);
            } else {
                double d22 = floatValue4;
                float cos5 = (float) (Math.cos(radians2) * d22);
                float sin5 = (float) (d22 * Math.sin(radians2));
                path.moveTo(cos5, sin5);
                d10 = radians2 + f40;
                f13 = cos5;
                f12 = sin5;
                f11 = 0.0f;
            }
            double ceil2 = Math.ceil(d19);
            double d23 = 2.0d;
            double d24 = ceil2 * 2.0d;
            double d25 = d10;
            int i13 = 0;
            boolean z11 = false;
            while (true) {
                double d26 = i13;
                if (d26 >= d24) {
                    break;
                }
                if (z11) {
                    f14 = floatValue4;
                } else {
                    f14 = floatValue5;
                }
                int i14 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                if (i14 != 0 && d26 == d24 - d23) {
                    f15 = (f38 * f41) / f39;
                } else {
                    f15 = f40;
                }
                if (i14 != 0 && d26 == d24 - 1.0d) {
                    f16 = floatValue5;
                    f17 = floatValue4;
                    f14 = f11;
                } else {
                    f16 = floatValue5;
                    f17 = floatValue4;
                }
                double d27 = f14;
                float f42 = f17;
                float f43 = f38;
                float cos6 = (float) (Math.cos(d25) * d27);
                float sin6 = (float) (d27 * Math.sin(d25));
                if (f6 == 0.0f && f10 == 0.0f) {
                    path.lineTo(cos6, sin6);
                    f19 = f43;
                    f18 = sin6;
                    f24 = f16;
                    f22 = f42;
                    f20 = f40;
                    f23 = f15;
                    f21 = f41;
                } else {
                    f19 = f43;
                    float f44 = f15;
                    double atan23 = (float) (Math.atan2(f12, f13) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan23);
                    float sin7 = (float) Math.sin(atan23);
                    float f45 = f40;
                    f18 = sin6;
                    double atan24 = (float) (Math.atan2(sin6, cos6) - 1.5707963267948966d);
                    float cos8 = (float) Math.cos(atan24);
                    float sin8 = (float) Math.sin(atan24);
                    if (z11) {
                        f25 = f6;
                    } else {
                        f25 = f10;
                    }
                    if (z11) {
                        f26 = f10;
                    } else {
                        f26 = f6;
                    }
                    if (z11) {
                        f27 = f16;
                    } else {
                        f27 = f42;
                    }
                    if (z11) {
                        f28 = f42;
                    } else {
                        f28 = f16;
                    }
                    float f46 = f27 * f25 * 0.47829f;
                    float f47 = cos7 * f46;
                    float f48 = f46 * sin7;
                    float f49 = f28 * f26 * 0.47829f;
                    float f50 = cos8 * f49;
                    float f51 = f49 * sin8;
                    if (i12 != 0) {
                        if (i13 == 0) {
                            f47 *= f41;
                            f48 *= f41;
                        } else {
                            if (d26 == d24 - 1.0d) {
                                f50 *= f41;
                                f51 *= f41;
                            }
                            f24 = f16;
                            f22 = f42;
                            f20 = f45;
                            f21 = f41;
                            path.cubicTo(f13 - f47, f12 - f48, cos6 + f50, f18 + f51, cos6, f18);
                            f23 = f44;
                        }
                    }
                    f24 = f16;
                    f22 = f42;
                    f20 = f45;
                    f21 = f41;
                    path.cubicTo(f13 - f47, f12 - f48, cos6 + f50, f18 + f51, cos6, f18);
                    f23 = f44;
                }
                d25 += f23;
                z11 = !z11;
                i13++;
                floatValue5 = f24;
                floatValue4 = f22;
                f41 = f21;
                f13 = cos6;
                f40 = f20;
                f38 = f19;
                f12 = f18;
                d23 = 2.0d;
                f39 = 2.0f;
            }
            PointF pointF2 = (PointF) eVar.d();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f48856p.c(path);
        this.f48857q = true;
        return path;
    }
}
