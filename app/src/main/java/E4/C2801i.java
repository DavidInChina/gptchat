package e4;

import A.C0007a0;
import G0.C0571a;
import android.util.LruCache;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import d4.AbstractC2597f;
import d4.C2595d;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import jf.C3963m;
import jf.y;
import s3.r;
import wf.AbstractC6216a;
import y.Y;

/* renamed from: e4.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2801i implements AbstractC2597f {

    /* renamed from: Y  reason: collision with root package name */
    public final B3.f f28966Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Long f28967Z;

    /* renamed from: h0  reason: collision with root package name */
    public final ThreadLocal f28968h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C3963m f28969i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C2800h f28970j0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashMap f28971k0;

    public /* synthetic */ C2801i(C3.b bVar) {
        this(null, bVar, 1, null);
    }

    public final C2595d a(Integer num, String str, wf.k kVar) {
        return new C2595d(h(num, new C0007a0(this, 21, str), kVar, C2798f.f28961Y));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y yVar;
        this.f28970j0.evictAll();
        B3.f fVar = this.f28966Y;
        if (fVar != null) {
            fVar.close();
            yVar = y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            j().close();
        }
    }

    public final Object h(Integer num, AbstractC6216a abstractC6216a, wf.k kVar, wf.k kVar2) {
        AbstractC2802j abstractC2802j;
        C2800h c2800h = this.f28970j0;
        if (num != null) {
            abstractC2802j = (AbstractC2802j) c2800h.remove(num);
        } else {
            abstractC2802j = null;
        }
        if (abstractC2802j == null) {
            abstractC2802j = (AbstractC2802j) abstractC6216a.mo122invoke();
        }
        if (kVar != null) {
            try {
                kVar.invoke(abstractC2802j);
            } catch (Throwable th2) {
                if (num != null) {
                    AbstractC2802j abstractC2802j2 = (AbstractC2802j) c2800h.put(num, abstractC2802j);
                    if (abstractC2802j2 != null) {
                        abstractC2802j2.close();
                    }
                } else {
                    abstractC2802j.close();
                }
                throw th2;
            }
        }
        Object invoke = kVar2.invoke(abstractC2802j);
        if (num != null) {
            AbstractC2802j abstractC2802j3 = (AbstractC2802j) c2800h.put(num, abstractC2802j);
            if (abstractC2802j3 != null) {
                abstractC2802j3.close();
            }
        } else {
            abstractC2802j.close();
        }
        return invoke;
    }

    public final C2595d i(Integer num, String str, C0571a c0571a, int i10, r rVar) {
        AbstractC3557B.c0("sql", str);
        return new C2595d(h(num, new C2799g(i10, 0, str, this), rVar, new Y(17, c0571a)));
    }

    public final B3.b j() {
        return (B3.b) this.f28969i0.getValue();
    }

    public final void k(String... strArr) {
        AbstractC3557B.c0("queryKeys", strArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f28971k0) {
            for (String str : strArr) {
                Set set = (Set) this.f28971k0.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [e4.h, android.util.LruCache] */
    public C2801i(B3.f fVar, B3.b bVar, int i10, Long l10) {
        this.f28966Y = fVar;
        this.f28967Z = l10;
        if ((fVar != null) ^ (bVar == null ? false : true)) {
            this.f28968h0 = new ThreadLocal();
            this.f28969i0 = R4.b.D1(new C0007a0(this, 20, bVar));
            this.f28970j0 = new LruCache(i10);
            this.f28971k0 = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
