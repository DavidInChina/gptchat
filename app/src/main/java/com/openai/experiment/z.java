package com.openai.experiment;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class z implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f27704a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f27705b;

    public z(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f27704a = abstractC2400f;
        this.f27705b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f27704a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f27705b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new G((ld.j) obj, (C) obj2);
    }
}
