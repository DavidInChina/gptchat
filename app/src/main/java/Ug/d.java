package Ug;

import Ng.T;
import Q1.u;
import Sg.z;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import pf.AbstractC5163j;
import wf.k;
import wf.n;
import wf.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17858a;

    /* renamed from: b  reason: collision with root package name */
    public final o f17859b;

    /* renamed from: c  reason: collision with root package name */
    public final o f17860c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17861d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f17862e;

    /* renamed from: f  reason: collision with root package name */
    public final o f17863f;

    /* renamed from: g  reason: collision with root package name */
    public Object f17864g;

    /* renamed from: h  reason: collision with root package name */
    public int f17865h = -1;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f f17866i;

    public d(f fVar, Object obj, o oVar, o oVar2, u uVar, AbstractC5163j abstractC5163j, o oVar3) {
        this.f17866i = fVar;
        this.f17858a = obj;
        this.f17859b = oVar;
        this.f17860c = oVar2;
        this.f17861d = uVar;
        this.f17862e = abstractC5163j;
        this.f17863f = oVar3;
    }

    public final void a() {
        T t10;
        Object obj = this.f17864g;
        if (obj instanceof z) {
            ((z) obj).g(this.f17865h, this.f17866i.f17872Y);
            return;
        }
        if (obj instanceof T) {
            t10 = (T) obj;
        } else {
            t10 = null;
        }
        if (t10 != null) {
            t10.dispose();
        }
    }

    public final Object b(Object obj, AbstractC4825e abstractC4825e) {
        u uVar = i.f17882e;
        Object obj2 = this.f17862e;
        if (this.f17861d == uVar) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>", obj2);
            return ((k) obj2).invoke(abstractC4825e);
        }
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>", obj2);
        return ((n) obj2).invoke(obj, abstractC4825e);
    }
}
