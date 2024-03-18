package H5;

import M3.H;
import id.AbstractC3557B;
import java.util.concurrent.ExecutorService;
import p5.AbstractC5091c;
import u5.RunnableC5841a;

/* loaded from: classes2.dex */
public final class h implements F5.g {

    /* renamed from: a  reason: collision with root package name */
    public final F5.g f7467a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f7468b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC5091c f7469c;

    public h(d6.g gVar, ExecutorService executorService, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f7467a = gVar;
        this.f7468b = executorService;
        this.f7469c = abstractC5091c;
    }

    @Override // F5.g
    public final void a(Object obj) {
        RunnableC5841a runnableC5841a = new RunnableC5841a(this, 3, obj);
        H.w0(this.f7468b, "Data writing", this.f7469c, runnableC5841a);
    }
}
