package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3599d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33409Y;

    /* renamed from: Z  reason: collision with root package name */
    public kotlin.jvm.internal.A f33410Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f33411h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f33412i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ t f33413j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33414k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3599d(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33413j0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33412i0 = obj;
        this.f33414k0 |= Integer.MIN_VALUE;
        return this.f33413j0.n(0L, 0L, this);
    }
}
