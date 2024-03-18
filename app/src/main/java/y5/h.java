package y5;

import A5.j;
import F5.l;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import r5.AbstractC5366a;
import r5.AbstractC5367b;
import r5.AbstractC5368c;

/* loaded from: classes2.dex */
public final class h implements AbstractC5368c {

    /* renamed from: a  reason: collision with root package name */
    public final d f50812a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5366a f50813b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5091c f50814c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f50815d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference f50816e = new AtomicReference(null);

    /* renamed from: f  reason: collision with root package name */
    public l f50817f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public A5.e f50818g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public j f50819h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public C5.c f50820i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public B5.c f50821j;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, F5.l] */
    /* JADX WARN: Type inference failed for: r2v4, types: [A5.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, A5.j] */
    /* JADX WARN: Type inference failed for: r2v6, types: [C5.c, java.lang.Object] */
    public h(d dVar, AbstractC5366a abstractC5366a, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f50812a = dVar;
        this.f50813b = abstractC5366a;
        this.f50814c = abstractC5091c;
    }

    public final void a(Object obj) {
        AbstractC5367b abstractC5367b = (AbstractC5367b) this.f50816e.get();
        if (abstractC5367b == null) {
            P4.a.m0(this.f50814c, 3, EnumC5090b.f42738Y, new X0.b(16, this), null, false, 56);
            return;
        }
        abstractC5367b.b(obj);
    }
}
