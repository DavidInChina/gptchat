package h2;

import android.content.Context;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: h2.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3305b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Context f31752Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC3310g f31753Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f31754h0;

    /* renamed from: i0  reason: collision with root package name */
    public Wg.d f31755i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f31756j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C3309f f31757k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f31758l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3305b(C3309f c3309f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31757k0 = c3309f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31756j0 = obj;
        this.f31758l0 |= Integer.MIN_VALUE;
        return this.f31757k0.a(null, null, null, this);
    }
}
