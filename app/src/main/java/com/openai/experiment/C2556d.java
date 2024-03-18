package com.openai.experiment;

import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import ld.C4428a;

/* renamed from: com.openai.experiment.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2556d implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f27682a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f27683b;

    public C2556d(AbstractC2400f abstractC2400f, AbstractC2400f abstractC2400f2) {
        this.f27682a = abstractC2400f;
        this.f27683b = abstractC2400f2;
    }

    @Override // p000if.a
    public final Object get() {
        Object obj = this.f27682a.get();
        AbstractC3557B.b0("get(...)", obj);
        Object obj2 = this.f27683b.get();
        AbstractC3557B.b0("get(...)", obj2);
        return new G((C4428a) obj, (C) obj2);
    }
}
