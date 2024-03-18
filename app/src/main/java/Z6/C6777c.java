package z6;

import M3.H;
import i6.f;
import id.AbstractC3557B;
import java.util.ArrayList;
import l8.AbstractC4344b;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import r5.d;
import r6.AbstractC5369a;
import t5.AbstractC5675a;
import u5.g;
import wf.k;
import y.C6473k;

/* renamed from: z6.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6777c {

    /* renamed from: a  reason: collision with root package name */
    public final d f51746a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5675a f51747b;

    /* renamed from: c  reason: collision with root package name */
    public final k f51748c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC5369a f51749d;

    /* renamed from: e  reason: collision with root package name */
    public k f51750e;

    /* renamed from: f  reason: collision with root package name */
    public k f51751f;

    public C6777c(g gVar, AbstractC5675a abstractC5675a, k kVar) {
        AbstractC5369a abstractC5369a;
        AbstractC3557B.c0("sdkCore", gVar);
        AbstractC3557B.c0("rumDataWriter", abstractC5675a);
        this.f51746a = gVar;
        this.f51747b = abstractC5675a;
        this.f51748c = kVar;
        f a5 = i6.b.a(gVar);
        if (a5 instanceof AbstractC5369a) {
            abstractC5369a = (AbstractC5369a) a5;
        } else {
            abstractC5369a = null;
        }
        this.f51749d = abstractC5369a;
        C6776b c6776b = C6776b.f51745Y;
        this.f51750e = c6776b;
        this.f51751f = c6776b;
    }

    public final void a(Exception exc) {
        ArrayList N02 = AbstractC4344b.N0(EnumC5090b.f42738Y);
        if (exc != null) {
            N02.add(EnumC5090b.f42740h0);
        }
        d dVar = this.f51746a;
        P4.a.l0(dVar.l(), 5, N02, C6775a.f51742h0, exc, 48);
        AbstractC5369a abstractC5369a = this.f51749d;
        if (abstractC5369a != null) {
            if (AbstractC3557B.K(this.f51750e, C6776b.f51745Y)) {
                P4.a.m0(dVar.l(), 4, EnumC5090b.f42739Z, C6775a.f51743i0, null, false, 56);
            }
            this.f51750e.invoke(abstractC5369a);
        }
    }

    public final void b() {
        AbstractC5368c h10 = this.f51746a.h("rum");
        if (h10 != null) {
            H.B0(h10, new C6473k(14, this));
        }
    }
}
