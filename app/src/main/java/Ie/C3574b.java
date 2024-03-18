package ie;

import Ng.AbstractC1073l0;
import Ng.C1059e0;
import id.AbstractC3557B;
import io.ktor.utils.io.w;
import io.ktor.utils.io.x;
import nf.AbstractC4831k;
import r.f;
import wf.o;
import xe.AbstractC6432u;
import xe.C6398C;
import xe.C6417f;
import ze.AbstractC6844c;
import ze.AbstractC6845d;
import ze.AbstractC6846e;
import ze.AbstractC6847f;
import ze.AbstractC6848g;

/* renamed from: ie.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3574b extends AbstractC6846e {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC6848g f33154a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4831k f33155b;

    /* renamed from: c  reason: collision with root package name */
    public final o f33156c;

    /* renamed from: d  reason: collision with root package name */
    public final x f33157d;

    public C3574b(AbstractC6848g abstractC6848g, AbstractC1073l0 abstractC1073l0, o oVar) {
        x xVar;
        AbstractC3557B.c0("callContext", abstractC1073l0);
        this.f33154a = abstractC6848g;
        this.f33155b = abstractC1073l0;
        this.f33156c = oVar;
        if (abstractC6848g instanceof AbstractC6844c) {
            xVar = AbstractC3557B.F(((AbstractC6844c) abstractC6848g).e());
        } else if (abstractC6848g instanceof AbstractC6845d) {
            x.f33593a.getClass();
            xVar = (x) w.f33592b.getValue();
        } else if (abstractC6848g instanceof AbstractC6846e) {
            xVar = ((AbstractC6846e) abstractC6848g).e();
        } else if (abstractC6848g instanceof AbstractC6847f) {
            xVar = R4.b.r2(C1059e0.f12936Y, abstractC1073l0, true, new C3573a(this, null)).f33364Z;
        } else {
            throw new RuntimeException();
        }
        this.f33157d = xVar;
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return this.f33154a.a();
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f33154a.b();
    }

    @Override // ze.AbstractC6848g
    public final AbstractC6432u c() {
        return this.f33154a.c();
    }

    @Override // ze.AbstractC6848g
    public final C6398C d() {
        return this.f33154a.d();
    }

    @Override // ze.AbstractC6846e
    public final x e() {
        return f.P(this.f33157d, this.f33155b, this.f33154a.a(), this.f33156c);
    }
}
