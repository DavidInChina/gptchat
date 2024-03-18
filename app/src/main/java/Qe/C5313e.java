package qe;

import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import xe.AbstractC6432u;
import xe.C6398C;
import xe.C6417f;
import ze.AbstractC6846e;
import ze.AbstractC6848g;

/* renamed from: qe.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5313e extends AbstractC6846e {

    /* renamed from: a  reason: collision with root package name */
    public final x f44088a;

    /* renamed from: b  reason: collision with root package name */
    public final C6417f f44089b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f44090c;

    /* renamed from: d  reason: collision with root package name */
    public final C6398C f44091d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC6432u f44092e;

    public C5313e(AbstractC6848g abstractC6848g, t tVar) {
        AbstractC3557B.c0("originalContent", abstractC6848g);
        this.f44088a = tVar;
        this.f44089b = abstractC6848g.b();
        this.f44090c = abstractC6848g.a();
        this.f44091d = abstractC6848g.d();
        this.f44092e = abstractC6848g.c();
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return this.f44090c;
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f44089b;
    }

    @Override // ze.AbstractC6848g
    public final AbstractC6432u c() {
        return this.f44092e;
    }

    @Override // ze.AbstractC6848g
    public final C6398C d() {
        return this.f44091d;
    }

    @Override // ze.AbstractC6846e
    public final x e() {
        return this.f44088a;
    }
}
