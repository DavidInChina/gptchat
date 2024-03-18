package Ve;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Ve.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1500h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1519y f18762Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.B f18763Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f18764h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1519y f18765i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f18766j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500h(C1519y c1519y, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18765i0 = c1519y;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18764h0 = obj;
        this.f18766j0 |= Integer.MIN_VALUE;
        return this.f18765i0.b(null, this);
    }
}
