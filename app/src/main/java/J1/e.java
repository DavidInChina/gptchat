package j1;

import Z.C1745x0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import i1.C3458c;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p2.C5064q;
import s2.AbstractC5532b;
import s2.n;
import s2.o;
import s2.w;
import s2.x;
import s2.y;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f35966a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f35967b;

    /* renamed from: c  reason: collision with root package name */
    public Object f35968c;

    /* renamed from: d  reason: collision with root package name */
    public Object f35969d;

    /* renamed from: e  reason: collision with root package name */
    public Object f35970e;

    /* renamed from: f  reason: collision with root package name */
    public AbstractCollection f35971f;

    /* renamed from: g  reason: collision with root package name */
    public AbstractCollection f35972g;

    /* renamed from: h  reason: collision with root package name */
    public Object f35973h;

    /* renamed from: i  reason: collision with root package name */
    public Object f35974i;

    public e(Looper looper, AbstractC5532b abstractC5532b, n nVar) {
        this(new CopyOnWriteArraySet(), looper, abstractC5532b, nVar, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f35974i) {
            try {
                if (this.f35966a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f35971f).add(new o(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [j1.k, java.lang.Object] */
    public final void b(f fVar, int i10, ArrayList arrayList, k kVar) {
        m mVar = fVar.f35978d;
        if (mVar.f35995c == null) {
            i1.e eVar = (i1.e) this.f35968c;
            if (mVar != eVar.f32492d) {
                k kVar2 = kVar;
                if (mVar != eVar.f32493e) {
                    if (kVar == null) {
                        ?? obj = new Object();
                        obj.f35989a = null;
                        obj.f35990b = new ArrayList();
                        obj.f35989a = mVar;
                        arrayList.add(obj);
                        kVar2 = obj;
                    }
                    mVar.f35995c = kVar2;
                    kVar2.f35990b.add(mVar);
                    f fVar2 = mVar.f36000h;
                    Iterator it = fVar2.f35985k.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (dVar instanceof f) {
                            b((f) dVar, i10, arrayList, kVar2);
                        }
                    }
                    f fVar3 = mVar.f36001i;
                    Iterator it2 = fVar3.f35985k.iterator();
                    while (it2.hasNext()) {
                        d dVar2 = (d) it2.next();
                        if (dVar2 instanceof f) {
                            b((f) dVar2, i10, arrayList, kVar2);
                        }
                    }
                    if (i10 == 1 && (mVar instanceof l)) {
                        Iterator it3 = ((l) mVar).f35991k.f35985k.iterator();
                        while (it3.hasNext()) {
                            d dVar3 = (d) it3.next();
                            if (dVar3 instanceof f) {
                                b((f) dVar3, i10, arrayList, kVar2);
                            }
                        }
                    }
                    Iterator it4 = fVar2.f35986l.iterator();
                    while (it4.hasNext()) {
                        b((f) it4.next(), i10, arrayList, kVar2);
                    }
                    Iterator it5 = fVar3.f35986l.iterator();
                    while (it5.hasNext()) {
                        b((f) it5.next(), i10, arrayList, kVar2);
                    }
                    if (i10 == 1 && (mVar instanceof l)) {
                        Iterator it6 = ((l) mVar).f35991k.f35986l.iterator();
                        while (it6.hasNext()) {
                            b((f) it6.next(), i10, arrayList, kVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i1.e eVar) {
        int i10;
        float f6;
        int i11;
        j jVar;
        l lVar;
        int i12;
        int i13;
        int i14;
        int i15;
        j jVar2;
        l lVar2;
        int i16;
        int i17;
        Iterator it = eVar.f32515d0.iterator();
        while (it.hasNext()) {
            i1.d dVar = (i1.d) it.next();
            int[] iArr = dVar.f32491c0;
            int i18 = iArr[0];
            int i19 = iArr[1];
            if (dVar.f32481V == 8) {
                dVar.f32486a = true;
            } else {
                float f10 = dVar.f32503o;
                if (f10 < 1.0f && i18 == 3) {
                    dVar.f32498j = 2;
                }
                float f11 = dVar.f32506r;
                if (f11 < 1.0f && i19 == 3) {
                    dVar.f32499k = 2;
                }
                int i20 = 1;
                if (dVar.f32475L > 0.0f) {
                    if (i18 == 3 && (i19 == 2 || i19 == 1)) {
                        dVar.f32498j = 3;
                    } else if (i19 == 3 && (i18 == 2 || i18 == 1)) {
                        dVar.f32499k = 3;
                    } else if (i18 == 3 && i19 == 3) {
                        if (dVar.f32498j == 0) {
                            dVar.f32498j = 3;
                        }
                        if (dVar.f32499k == 0) {
                            dVar.f32499k = 3;
                        }
                    }
                }
                C3458c c3458c = dVar.f32514z;
                C3458c c3458c2 = dVar.f32512x;
                if (i18 == 3 && dVar.f32498j == 1 && (c3458c2.f32460d == null || c3458c.f32460d == null)) {
                    i18 = 2;
                }
                C3458c c3458c3 = dVar.f32464A;
                C3458c c3458c4 = dVar.f32513y;
                if (i19 == 3 && dVar.f32499k == 1 && (c3458c4.f32460d == null || c3458c3.f32460d == null)) {
                    i10 = 2;
                } else {
                    i10 = i19;
                }
                j jVar3 = dVar.f32492d;
                jVar3.f35996d = i18;
                int i21 = dVar.f32498j;
                jVar3.f35993a = i21;
                l lVar3 = dVar.f32493e;
                lVar3.f35996d = i10;
                int i22 = dVar.f32499k;
                lVar3.f35993a = i22;
                if (i18 != 4 && i18 != 1) {
                    f6 = f10;
                    i11 = 2;
                    if (i18 != 2) {
                        int[] iArr2 = eVar.f32491c0;
                        C3458c[] c3458cArr = dVar.f32469F;
                        if (i18 != 3) {
                            if (i10 != i11 && i10 != 1) {
                                lVar = lVar3;
                                jVar = jVar3;
                                i12 = 3;
                                if (i10 == i12) {
                                }
                                i14 = 1;
                                i13 = 3;
                                if (i18 == i13) {
                                }
                            } else if (i21 == 3) {
                                if (i10 == i11) {
                                    jVar2 = jVar3;
                                    lVar2 = lVar3;
                                    h(dVar, i11, 0, i11, 0);
                                } else {
                                    jVar2 = jVar3;
                                    lVar2 = lVar3;
                                }
                                int j6 = dVar.j();
                                h(dVar, 1, (int) ((j6 * dVar.f32475L) + 0.5f), 1, j6);
                                jVar2.f35997e.d(dVar.m());
                                lVar2.f35997e.d(dVar.j());
                                dVar.f32486a = true;
                            } else {
                                jVar = jVar3;
                                if (i21 == 1) {
                                    h(dVar, 2, 0, i10, 0);
                                    jVar.f35997e.f35987m = dVar.m();
                                } else {
                                    if (i21 == 2) {
                                        int i23 = iArr2[0];
                                        if (i23 == 1 || i23 == 4) {
                                            h(dVar, 1, (int) ((f6 * eVar.m()) + 0.5f), i10, dVar.j());
                                            jVar.f35997e.d(dVar.m());
                                            lVar3.f35997e.d(dVar.j());
                                            dVar.f32486a = true;
                                        }
                                    } else if (c3458cArr[0].f32460d == null || c3458cArr[1].f32460d == null) {
                                        h(dVar, 2, 0, i10, 0);
                                        jVar.f35997e.d(dVar.m());
                                        lVar3.f35997e.d(dVar.j());
                                        dVar.f32486a = true;
                                    }
                                    if (i10 == i12) {
                                        if (i18 != 2 && i18 != 1) {
                                            i13 = i12;
                                            i14 = 1;
                                            if (i18 == i13) {
                                                if (i21 == i14) {
                                                }
                                                h(dVar, 2, 0, 2, 0);
                                                jVar.f35997e.f35987m = dVar.m();
                                                lVar.f35997e.f35987m = dVar.j();
                                            }
                                        } else if (i22 == i12) {
                                            if (i18 == 2) {
                                                h(dVar, 2, 0, 2, 0);
                                            }
                                            int m10 = dVar.m();
                                            float f12 = dVar.f32475L;
                                            if (dVar.f32476M == -1) {
                                                f12 = 1.0f / f12;
                                            }
                                            h(dVar, 1, m10, 1, (int) ((m10 * f12) + 0.5f));
                                            jVar.f35997e.d(dVar.m());
                                            lVar.f35997e.d(dVar.j());
                                            dVar.f32486a = true;
                                        } else if (i22 == 1) {
                                            h(dVar, i18, 0, 2, 0);
                                            lVar.f35997e.f35987m = dVar.j();
                                        } else {
                                            if (i22 == 2) {
                                                int i24 = iArr2[1];
                                                if (i24 == 1 || i24 == 4) {
                                                    h(dVar, i18, dVar.m(), 1, (int) ((f11 * eVar.j()) + 0.5f));
                                                    jVar.f35997e.d(dVar.m());
                                                    lVar.f35997e.d(dVar.j());
                                                    dVar.f32486a = true;
                                                }
                                            } else if (c3458cArr[2].f32460d == null || c3458cArr[3].f32460d == null) {
                                                h(dVar, 2, 0, i10, 0);
                                                jVar.f35997e.d(dVar.m());
                                                lVar.f35997e.d(dVar.j());
                                                dVar.f32486a = true;
                                            }
                                            if (i18 == i13 && i10 == i13) {
                                                if (i21 == i14 && i22 != i14) {
                                                    if (i22 == 2 && i21 == 2 && ((i15 = iArr2[0]) == 1 || i15 == 1)) {
                                                        int i25 = iArr2[i14];
                                                        if (i25 == 1 || i25 == 1) {
                                                            h(dVar, 1, (int) ((f6 * eVar.m()) + 0.5f), 1, (int) ((f11 * eVar.j()) + 0.5f));
                                                            jVar.f35997e.d(dVar.m());
                                                            lVar.f35997e.d(dVar.j());
                                                            dVar.f32486a = true;
                                                        }
                                                    }
                                                } else {
                                                    h(dVar, 2, 0, 2, 0);
                                                    jVar.f35997e.f35987m = dVar.m();
                                                    lVar.f35997e.f35987m = dVar.j();
                                                }
                                            }
                                        }
                                    }
                                    i14 = 1;
                                    i13 = 3;
                                    if (i18 == i13) {
                                    }
                                }
                            }
                        } else {
                            jVar = jVar3;
                        }
                        lVar = lVar3;
                        i12 = 3;
                        if (i10 == i12) {
                        }
                        i14 = 1;
                        i13 = 3;
                        if (i18 == i13) {
                        }
                    }
                } else {
                    f6 = f10;
                    i11 = 2;
                }
                if (i10 != 4 && i10 != 1 && i10 != i11) {
                    int[] iArr22 = eVar.f32491c0;
                    C3458c[] c3458cArr2 = dVar.f32469F;
                    if (i18 != 3) {
                    }
                    lVar = lVar3;
                    i12 = 3;
                    if (i10 == i12) {
                    }
                    i14 = 1;
                    i13 = 3;
                    if (i18 == i13) {
                    }
                } else {
                    int m11 = dVar.m();
                    if (i18 == 4) {
                        i16 = (eVar.m() - c3458c2.f32461e) - c3458c.f32461e;
                        i18 = 1;
                    } else {
                        i16 = m11;
                    }
                    int j10 = dVar.j();
                    if (i10 == 4) {
                        i17 = (eVar.j() - c3458c4.f32461e) - c3458c3.f32461e;
                    } else {
                        i17 = j10;
                        i20 = i10;
                    }
                    h(dVar, i18, i16, i20, i17);
                    jVar3.f35997e.d(dVar.m());
                    lVar3.f35997e.d(dVar.j());
                    dVar.f32486a = true;
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f35970e;
        arrayList.clear();
        i1.e eVar = (i1.e) this.f35969d;
        eVar.f32492d.f();
        eVar.f32493e.f();
        arrayList.add(eVar.f32492d);
        arrayList.add(eVar.f32493e);
        Iterator it = eVar.f32515d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            i1.d dVar = (i1.d) it.next();
            if (dVar instanceof i1.h) {
                m mVar = new m(dVar);
                dVar.f32492d.f();
                dVar.f32493e.f();
                mVar.f35998f = ((i1.h) dVar).f32588h0;
                arrayList.add(mVar);
            } else {
                if (dVar.r()) {
                    if (dVar.f32488b == null) {
                        dVar.f32488b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f32488b);
                } else {
                    arrayList.add(dVar.f32492d);
                }
                if (dVar.s()) {
                    if (dVar.f32490c == null) {
                        dVar.f32490c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f32490c);
                } else {
                    arrayList.add(dVar.f32493e);
                }
                if (dVar instanceof i1.j) {
                    arrayList.add(new m(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar2 = (m) it3.next();
            if (mVar2.f35994b != eVar) {
                mVar2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f35972g;
        arrayList2.clear();
        i1.e eVar2 = (i1.e) this.f35968c;
        f(eVar2.f32492d, 0, arrayList2);
        f(eVar2.f32493e, 1, arrayList2);
        this.f35966a = false;
    }

    public final int e(i1.e eVar, int i10) {
        ArrayList arrayList;
        int i11;
        int i12;
        long j6;
        m mVar;
        m mVar2;
        float f6;
        long j10;
        i1.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f35972g;
        int size = arrayList2.size();
        int i13 = 0;
        long j11 = 0;
        while (i13 < size) {
            m mVar3 = ((k) arrayList2.get(i13)).f35989a;
            if (!(mVar3 instanceof c) ? !(i10 != 0 ? (mVar3 instanceof l) : (mVar3 instanceof j)) : ((c) mVar3).f35998f != i10) {
                arrayList = arrayList2;
                i12 = size;
                i11 = i13;
                j6 = 0;
            } else {
                if (i10 == 0) {
                    mVar = eVar2.f32492d;
                } else {
                    mVar = eVar2.f32493e;
                }
                f fVar = mVar.f36000h;
                if (i10 == 0) {
                    mVar2 = eVar2.f32492d;
                } else {
                    mVar2 = eVar2.f32493e;
                }
                f fVar2 = mVar2.f36001i;
                boolean contains = mVar3.f36000h.f35986l.contains(fVar);
                f fVar3 = mVar3.f36001i;
                boolean contains2 = fVar3.f35986l.contains(fVar2);
                long j12 = mVar3.j();
                f fVar4 = mVar3.f36000h;
                if (contains && contains2) {
                    long b10 = k.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i12 = size;
                    long a5 = k.a(fVar3, 0L);
                    long j13 = b10 - j12;
                    int i14 = fVar3.f35980f;
                    arrayList = arrayList3;
                    i11 = i13;
                    if (j13 >= (-i14)) {
                        j13 += i14;
                    }
                    long j14 = fVar4.f35980f;
                    long j15 = ((-a5) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    i1.d dVar = mVar3.f35994b;
                    if (i10 == 0) {
                        f6 = dVar.S;
                    } else if (i10 == 1) {
                        f6 = dVar.T;
                    } else {
                        dVar.getClass();
                        f6 = -1.0f;
                    }
                    if (f6 > 0.0f) {
                        j10 = (((float) j13) / (1.0f - f6)) + (((float) j15) / f6);
                    } else {
                        j10 = 0;
                    }
                    float f10 = (float) j10;
                    j6 = (fVar4.f35980f + ((((f10 * f6) + 0.5f) + j12) + AbstractC6463a.d(1.0f, f6, f10, 0.5f))) - fVar3.f35980f;
                } else {
                    arrayList = arrayList2;
                    i12 = size;
                    i11 = i13;
                    if (contains) {
                        j6 = Math.max(k.b(fVar4, fVar4.f35980f), fVar4.f35980f + j12);
                    } else if (contains2) {
                        j6 = Math.max(-k.a(fVar3, fVar3.f35980f), (-fVar3.f35980f) + j12);
                    } else {
                        j6 = (mVar3.j() + fVar4.f35980f) - fVar3.f35980f;
                    }
                }
            }
            j11 = Math.max(j11, j6);
            i13 = i11 + 1;
            eVar2 = eVar;
            size = i12;
            arrayList2 = arrayList;
        }
        return (int) j11;
    }

    public final void f(m mVar, int i10, ArrayList arrayList) {
        f fVar;
        Iterator it = mVar.f36000h.f35985k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = mVar.f36001i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                b((f) dVar, i10, arrayList, null);
            } else if (dVar instanceof m) {
                b(((m) dVar).f36000h, i10, arrayList, null);
            }
        }
        Iterator it2 = fVar.f35985k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof f) {
                b((f) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof m) {
                b(((m) dVar2).f36001i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((l) mVar).f35991k.f35985k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof f) {
                    b((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void g() {
        m();
        if (((ArrayDeque) this.f35973h).isEmpty()) {
            return;
        }
        y yVar = (y) ((s2.j) this.f35969d);
        if (!yVar.f45201a.hasMessages(0)) {
            yVar.getClass();
            x b10 = y.b();
            b10.f45199a = yVar.f45201a.obtainMessage(0);
            yVar.getClass();
            Message message = b10.f45199a;
            message.getClass();
            yVar.f45201a.sendMessageAtFrontOfQueue(message);
            b10.a();
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f35972g;
        boolean z10 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f35973h);
        ((ArrayDeque) this.f35973h).clear();
        if (z10) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void h(i1.d dVar, int i10, int i11, int i12, int i13) {
        boolean z10;
        b bVar = (b) this.f35974i;
        bVar.f35954a = i10;
        bVar.f35955b = i12;
        bVar.f35956c = i11;
        bVar.f35957d = i13;
        ((k1.f) this.f35973h).a(dVar, bVar);
        dVar.z(bVar.f35958e);
        dVar.w(bVar.f35959f);
        dVar.f32511w = bVar.f35961h;
        int i14 = bVar.f35960g;
        dVar.P = i14;
        if (i14 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.f32511w = z10;
    }

    public final void i() {
        boolean z10;
        C3898a c3898a;
        Iterator it = ((i1.e) this.f35968c).f32515d0.iterator();
        while (it.hasNext()) {
            i1.d dVar = (i1.d) it.next();
            if (!dVar.f32486a) {
                int[] iArr = dVar.f32491c0;
                boolean z11 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f32498j;
                int i13 = dVar.f32499k;
                if (i10 != 2 && (i10 != 3 || i12 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z11 = true;
                }
                j jVar = dVar.f32492d;
                g gVar = jVar.f35997e;
                boolean z12 = gVar.f35984j;
                l lVar = dVar.f32493e;
                g gVar2 = lVar.f35997e;
                boolean z13 = gVar2.f35984j;
                if (z12 && z13) {
                    h(dVar, 1, gVar.f35981g, 1, gVar2.f35981g);
                    dVar.f32486a = true;
                } else if (z12 && z11) {
                    h(dVar, 1, gVar.f35981g, 2, gVar2.f35981g);
                    if (i11 == 3) {
                        lVar.f35997e.f35987m = dVar.j();
                    } else {
                        lVar.f35997e.d(dVar.j());
                        dVar.f32486a = true;
                    }
                } else if (z13 && z10) {
                    h(dVar, 2, gVar.f35981g, 1, gVar2.f35981g);
                    if (i10 == 3) {
                        jVar.f35997e.f35987m = dVar.m();
                    } else {
                        jVar.f35997e.d(dVar.m());
                        dVar.f32486a = true;
                    }
                }
                if (dVar.f32486a && (c3898a = lVar.f35992l) != null) {
                    c3898a.d(dVar.P);
                }
            }
        }
    }

    public final void j(int i10, s2.m mVar) {
        m();
        ((ArrayDeque) this.f35973h).add(new s2.l(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f35971f), i10, mVar, 0));
    }

    public final void k() {
        m();
        synchronized (this.f35974i) {
            this.f35966a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f35971f).iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            n nVar = (n) this.f35970e;
            oVar.f45172d = true;
            if (oVar.f45171c) {
                oVar.f45171c = false;
                nVar.d(oVar.f45169a, oVar.f45170b.b());
            }
        }
        ((CopyOnWriteArraySet) this.f35971f).clear();
    }

    public final void l(int i10, s2.m mVar) {
        j(i10, mVar);
        g();
    }

    public final void m() {
        boolean z10;
        if (!this.f35967b) {
            return;
        }
        if (Thread.currentThread() == ((y) ((s2.j) this.f35969d)).f45201a.getLooper().getThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
    }

    public e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, AbstractC5532b abstractC5532b, n nVar, boolean z10) {
        this.f35968c = abstractC5532b;
        this.f35971f = copyOnWriteArraySet;
        this.f35970e = nVar;
        this.f35974i = new Object();
        this.f35972g = new ArrayDeque();
        this.f35973h = new ArrayDeque();
        this.f35969d = ((w) abstractC5532b).a(looper, new Handler.Callback() { // from class: s2.k
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                j1.e eVar = j1.e.this;
                Iterator it = ((CopyOnWriteArraySet) eVar.f35971f).iterator();
                while (it.hasNext()) {
                    o oVar = (o) it.next();
                    n nVar2 = (n) eVar.f35970e;
                    if (!oVar.f45172d && oVar.f45171c) {
                        C5064q b10 = oVar.f45170b.b();
                        oVar.f45170b = new C1745x0(1);
                        oVar.f45171c = false;
                        nVar2.d(oVar.f45169a, b10);
                    }
                    if (((y) ((j) eVar.f35969d)).f45201a.hasMessages(0)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.f35967b = z10;
    }
}
