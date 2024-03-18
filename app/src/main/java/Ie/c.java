package Ie;

import Ad.l;
import K4.C0813a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import q1.AbstractC5260f;
import wf.o;
import xf.AbstractC6438a;
import xf.AbstractC6440c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final ArrayList f8569e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final C0813a f8570a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5260f f8571b;

    /* renamed from: c  reason: collision with root package name */
    public List f8572c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8573d;

    public c(C0813a c0813a, AbstractC5260f abstractC5260f) {
        AbstractC3557B.c0("phase", c0813a);
        ArrayList arrayList = f8569e;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>", arrayList);
        if ((arrayList instanceof AbstractC6438a) && !(arrayList instanceof AbstractC6440c)) {
            l.g1("kotlin.collections.MutableList", arrayList);
            throw null;
        }
        this.f8570a = c0813a;
        this.f8571b = abstractC5260f;
        this.f8572c = arrayList;
        this.f8573d = true;
        if (arrayList.isEmpty()) {
            return;
        }
        throw new IllegalStateException("The shared empty array list has been modified".toString());
    }

    public final void a(o oVar) {
        if (this.f8573d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f8572c);
            this.f8572c = arrayList;
            this.f8573d = false;
        }
        this.f8572c.add(oVar);
    }

    public final String toString() {
        return "Phase `" + this.f8570a.f9398Z + "`, " + this.f8572c.size() + " handlers";
    }
}
