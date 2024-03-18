package h3;

import g3.AbstractC3163f;
import g3.AbstractC3168k;
import g3.C3167j;
import h.C3276b;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import s2.AbstractC5530A;
import x2.AbstractC6266a;

/* renamed from: h3.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3320i implements AbstractC3163f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f31861a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f31862b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue f31863c;

    /* renamed from: d  reason: collision with root package name */
    public C3318g f31864d;

    /* renamed from: e  reason: collision with root package name */
    public long f31865e;

    /* renamed from: f  reason: collision with root package name */
    public long f31866f;

    /* JADX WARN: Type inference failed for: r2v1, types: [h3.h, x2.a, java.lang.Object] */
    public AbstractC3320i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f31861a.add(new x2.h(1));
        }
        this.f31862b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f31862b;
            C3276b c3276b = new C3276b(18, this);
            ?? abstractC6266a = new AbstractC6266a();
            abstractC6266a.f31860k0 = c3276b;
            arrayDeque.add(abstractC6266a);
        }
        this.f31863c = new PriorityQueue();
    }

    @Override // g3.AbstractC3163f
    public final void a(long j6) {
        this.f31865e = j6;
    }

    @Override // x2.e
    public final Object c() {
        boolean z10;
        if (this.f31864d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.n(z10);
        ArrayDeque arrayDeque = this.f31861a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C3318g c3318g = (C3318g) arrayDeque.pollFirst();
        this.f31864d = c3318g;
        return c3318g;
    }

    @Override // x2.e
    public final void d(C3167j c3167j) {
        boolean z10;
        if (c3167j == this.f31864d) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        C3318g c3318g = (C3318g) c3167j;
        if (c3318g.g(Integer.MIN_VALUE)) {
            c3318g.i();
            this.f31861a.add(c3318g);
        } else {
            long j6 = this.f31866f;
            this.f31866f = 1 + j6;
            c3318g.f31859q0 = j6;
            this.f31863c.add(c3318g);
        }
        this.f31864d = null;
    }

    public abstract C4.c e();

    public abstract void f(C3318g c3318g);

    @Override // x2.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f31866f = 0L;
        this.f31865e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f31863c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f31861a;
            if (isEmpty) {
                break;
            }
            C3318g c3318g = (C3318g) priorityQueue.poll();
            int i10 = AbstractC5530A.f45131a;
            c3318g.i();
            arrayDeque.add(c3318g);
        }
        C3318g c3318g2 = this.f31864d;
        if (c3318g2 != null) {
            c3318g2.i();
            arrayDeque.add(c3318g2);
            this.f31864d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        return null;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC3168k b() {
        ArrayDeque arrayDeque = this.f31862b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue priorityQueue = this.f31863c;
                if (priorityQueue.isEmpty()) {
                    break;
                }
                int i10 = AbstractC5530A.f45131a;
                if (((C3318g) priorityQueue.peek()).f48643l0 > this.f31865e) {
                    break;
                }
                C3318g c3318g = (C3318g) priorityQueue.poll();
                boolean g10 = c3318g.g(4);
                ArrayDeque arrayDeque2 = this.f31861a;
                if (g10) {
                    AbstractC3168k abstractC3168k = (AbstractC3168k) arrayDeque.pollFirst();
                    abstractC3168k.e(4);
                    c3318g.i();
                    arrayDeque2.add(c3318g);
                    return abstractC3168k;
                }
                f(c3318g);
                if (h()) {
                    C4.c e10 = e();
                    AbstractC3168k abstractC3168k2 = (AbstractC3168k) arrayDeque.pollFirst();
                    long j6 = c3318g.f48643l0;
                    abstractC3168k2.f48647h0 = j6;
                    abstractC3168k2.f31185i0 = e10;
                    abstractC3168k2.f31186j0 = j6;
                    c3318g.i();
                    arrayDeque2.add(c3318g);
                    return abstractC3168k2;
                }
                c3318g.i();
                arrayDeque2.add(c3318g);
            }
        } else {
            return null;
        }
    }

    public abstract boolean h();

    @Override // x2.e
    public void release() {
    }
}
