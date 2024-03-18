package Ie;

import Ad.l;
import Df.H;
import K4.C0813a;
import e1.C2762b;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kf.t;
import kf.v;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import nf.AbstractC4831k;
import wf.o;
import xf.AbstractC6438a;
import xf.AbstractC6440c;

/* loaded from: classes.dex */
public abstract class d {
    private volatile /* synthetic */ Object _interceptors = null;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8574a;

    /* renamed from: b  reason: collision with root package name */
    public int f8575b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8576c;

    /* renamed from: d  reason: collision with root package name */
    public C0813a f8577d;

    public d(C0813a... c0813aArr) {
        H.d();
        this.f8574a = AbstractC4344b.N0(Arrays.copyOf(c0813aArr, c0813aArr.length));
    }

    public final Object a(Object obj, Object obj2, AbstractC4825e abstractC4825e) {
        e eVar;
        c cVar;
        int u02;
        c cVar2;
        AbstractC4831k context = abstractC4825e.getContext();
        if (((List) this._interceptors) == null) {
            int i10 = this.f8575b;
            if (i10 == 0) {
                this._interceptors = v.f37483Y;
                this.f8576c = false;
                this.f8577d = null;
            } else {
                ArrayList arrayList = this.f8574a;
                if (i10 == 1 && (u02 = AbstractC4344b.u0(arrayList)) >= 0) {
                    int i11 = 0;
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        if (obj3 instanceof c) {
                            cVar2 = (c) obj3;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null && !cVar2.f8572c.isEmpty()) {
                            List list = cVar2.f8572c;
                            cVar2.f8573d = true;
                            this._interceptors = list;
                            this.f8576c = false;
                            this.f8577d = cVar2.f8570a;
                            break;
                        } else if (i11 == u02) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int u03 = AbstractC4344b.u0(arrayList);
                if (u03 >= 0) {
                    int i12 = 0;
                    while (true) {
                        Object obj4 = arrayList.get(i12);
                        if (obj4 instanceof c) {
                            cVar = (c) obj4;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            List list2 = cVar.f8572c;
                            arrayList2.ensureCapacity(list2.size() + arrayList2.size());
                            int size = list2.size();
                            for (int i13 = 0; i13 < size; i13++) {
                                arrayList2.add(list2.get(i13));
                            }
                        }
                        if (i12 == u03) {
                            break;
                        }
                        i12++;
                    }
                }
                this._interceptors = arrayList2;
                this.f8576c = false;
                this.f8577d = null;
            }
        }
        this.f8576c = true;
        List list3 = (List) this._interceptors;
        AbstractC3557B.Z(list3);
        boolean d10 = d();
        AbstractC3557B.c0("context", obj);
        AbstractC3557B.c0("subject", obj2);
        AbstractC3557B.c0("coroutineContext", context);
        if (!f.f8579a && !d10) {
            eVar = new k(obj2, obj, list3);
        } else {
            eVar = new b(obj, list3, obj2, context);
        }
        return eVar.a(obj2, abstractC4825e);
    }

    public final c b(C0813a c0813a) {
        ArrayList arrayList = this.f8574a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == c0813a) {
                c cVar = new c(c0813a, h.f8581h);
                arrayList.set(i10, cVar);
                return cVar;
            }
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.f8570a == c0813a) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final int c(C0813a c0813a) {
        ArrayList arrayList = this.f8574a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj == c0813a || ((obj instanceof c) && ((c) obj).f8570a == c0813a)) {
                return i10;
            }
        }
        return -1;
    }

    public abstract boolean d();

    public final boolean e(C0813a c0813a) {
        ArrayList arrayList = this.f8574a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj != c0813a) {
                if ((obj instanceof c) && ((c) obj).f8570a == c0813a) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(C0813a c0813a, o oVar) {
        AbstractC3557B.c0("phase", c0813a);
        c b10 = b(c0813a);
        if (b10 != null) {
            l.M(3, oVar);
            List list = (List) this._interceptors;
            if (!this.f8574a.isEmpty() && list != null && !this.f8576c && (!(list instanceof AbstractC6438a) || (list instanceof AbstractC6440c))) {
                if (AbstractC3557B.K(this.f8577d, c0813a)) {
                    list.add(oVar);
                } else if (AbstractC3557B.K(c0813a, t.o2(this.f8574a)) || c(c0813a) == AbstractC4344b.u0(this.f8574a)) {
                    c b11 = b(c0813a);
                    AbstractC3557B.Z(b11);
                    b11.a(oVar);
                    list.add(oVar);
                }
                this.f8575b++;
                return;
            }
            b10.a(oVar);
            this.f8575b++;
            this._interceptors = null;
            this.f8576c = false;
            this.f8577d = null;
            return;
        }
        throw new C2762b("Phase " + c0813a + " was not registered for this pipeline");
    }
}
