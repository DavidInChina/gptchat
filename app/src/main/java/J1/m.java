package j1;

import i1.C3458c;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f35993a;

    /* renamed from: b  reason: collision with root package name */
    public i1.d f35994b;

    /* renamed from: c  reason: collision with root package name */
    public k f35995c;

    /* renamed from: d  reason: collision with root package name */
    public int f35996d;

    /* renamed from: e  reason: collision with root package name */
    public final g f35997e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f35998f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f35999g = false;

    /* renamed from: h  reason: collision with root package name */
    public final f f36000h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f36001i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f36002j = 1;

    public m(i1.d dVar) {
        this.f35994b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f35986l.add(fVar2);
        fVar.f35980f = i10;
        fVar2.f35985k.add(fVar);
    }

    public static f h(C3458c c3458c) {
        C3458c c3458c2 = c3458c.f32460d;
        if (c3458c2 == null) {
            return null;
        }
        int f6 = AbstractC6708l.f(c3458c2.f32459c);
        i1.d dVar = c3458c2.f32458b;
        if (f6 != 1) {
            if (f6 != 2) {
                if (f6 != 3) {
                    if (f6 != 4) {
                        if (f6 != 5) {
                            return null;
                        }
                        return dVar.f32493e.f35991k;
                    }
                    return dVar.f32493e.f36001i;
                }
                return dVar.f32492d.f36001i;
            }
            return dVar.f32493e.f36000h;
        }
        return dVar.f32492d.f36000h;
    }

    public static f i(C3458c c3458c, int i10) {
        m mVar;
        C3458c c3458c2 = c3458c.f32460d;
        if (c3458c2 == null) {
            return null;
        }
        i1.d dVar = c3458c2.f32458b;
        if (i10 == 0) {
            mVar = dVar.f32492d;
        } else {
            mVar = dVar.f32493e;
        }
        int f6 = AbstractC6708l.f(c3458c2.f32459c);
        if (f6 != 1 && f6 != 2) {
            if (f6 != 3 && f6 != 4) {
                return null;
            }
            return mVar.f36001i;
        }
        return mVar.f36000h;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f35986l.add(fVar2);
        fVar.f35986l.add(this.f35997e);
        fVar.f35982h = i10;
        fVar.f35983i = gVar;
        fVar2.f35985k.add(fVar);
        gVar.f35985k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            i1.d dVar = this.f35994b;
            int i13 = dVar.f32502n;
            i12 = Math.max(dVar.f32501m, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            i1.d dVar2 = this.f35994b;
            int i14 = dVar2.f32505q;
            i12 = Math.max(dVar2.f32504p, i10);
            if (i14 > 0) {
                i12 = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public long j() {
        g gVar = this.f35997e;
        if (gVar.f35984j) {
            return gVar.f35981g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(C3458c c3458c, C3458c c3458c2, int i10) {
        float f6;
        m mVar;
        g gVar;
        float f10;
        g gVar2;
        int i11;
        f h10 = h(c3458c);
        f h11 = h(c3458c2);
        if (h10.f35984j && h11.f35984j) {
            int c10 = c3458c.c() + h10.f35981g;
            int c11 = h11.f35981g - c3458c2.c();
            int i12 = c11 - c10;
            g gVar3 = this.f35997e;
            if (!gVar3.f35984j && this.f35996d == 3) {
                int i13 = this.f35993a;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i1.d dVar = this.f35994b;
                                m mVar2 = dVar.f32492d;
                                int i14 = mVar2.f35996d;
                                m mVar3 = dVar.f32493e;
                                if (i14 != 3 || mVar2.f35993a != 3 || mVar3.f35996d != 3 || mVar3.f35993a != 3) {
                                    if (i10 == 0) {
                                        mVar2 = mVar3;
                                    }
                                    if (mVar2.f35997e.f35984j) {
                                        float f11 = dVar.f32475L;
                                        if (i10 == 1) {
                                            i11 = (int) ((gVar2.f35981g / f11) + 0.5f);
                                        } else {
                                            i11 = (int) ((f11 * gVar2.f35981g) + 0.5f);
                                        }
                                        gVar3.d(i11);
                                    }
                                }
                            }
                        } else {
                            i1.d dVar2 = this.f35994b;
                            i1.d dVar3 = dVar2.f32472I;
                            if (dVar3 != null) {
                                if (i10 == 0) {
                                    mVar = dVar3.f32492d;
                                } else {
                                    mVar = dVar3.f32493e;
                                }
                                if (mVar.f35997e.f35984j) {
                                    if (i10 == 0) {
                                        f10 = dVar2.f32503o;
                                    } else {
                                        f10 = dVar2.f32506r;
                                    }
                                    gVar3.d(g((int) ((gVar.f35981g * f10) + 0.5f), i10));
                                }
                            }
                        }
                    } else {
                        gVar3.d(Math.min(g(gVar3.f35987m, i10), i12));
                    }
                } else {
                    gVar3.d(g(i12, i10));
                }
            }
            if (!gVar3.f35984j) {
                return;
            }
            int i15 = gVar3.f35981g;
            f fVar = this.f36001i;
            f fVar2 = this.f36000h;
            if (i15 == i12) {
                fVar2.d(c10);
                fVar.d(c11);
                return;
            }
            i1.d dVar4 = this.f35994b;
            if (i10 == 0) {
                f6 = dVar4.S;
            } else {
                f6 = dVar4.T;
            }
            if (h10 == h11) {
                c10 = h10.f35981g;
                c11 = h11.f35981g;
                f6 = 0.5f;
            }
            fVar2.d((int) ((((c11 - c10) - i15) * f6) + c10 + 0.5f));
            fVar.d(fVar2.f35981g + gVar3.f35981g);
        }
    }
}
