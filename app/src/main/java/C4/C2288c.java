package c4;

import Ad.l;
import W9.d;
import d4.AbstractC2592a;
import d4.AbstractC2596e;
import d4.AbstractC2597f;
import d4.AbstractC2599h;
import d4.C2595d;
import id.AbstractC3557B;
import nf.C4832l;

/* renamed from: c4.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2288c implements AbstractC2599h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC2599h f26246b = d.f20834a;

    /* renamed from: a  reason: collision with root package name */
    public final long f26245a = 2;

    @Override // d4.AbstractC2599h
    public final AbstractC2596e a(AbstractC2597f abstractC2597f, long j6, long j10, AbstractC2592a[] abstractC2592aArr) {
        AbstractC3557B.c0("driver", abstractC2597f);
        AbstractC3557B.c0("callbacks", abstractC2592aArr);
        return new C2595d(l.a1(C4832l.f40334Y, new C2287b(this.f26246b, abstractC2597f, j6, j10, abstractC2592aArr, null)));
    }

    @Override // d4.AbstractC2599h
    public final AbstractC2596e b(AbstractC2597f abstractC2597f) {
        AbstractC3557B.c0("driver", abstractC2597f);
        return new C2595d(l.a1(C4832l.f40334Y, new C2286a(this.f26246b, abstractC2597f, null)));
    }
}
