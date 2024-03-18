package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3601f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33422Y;

    /* renamed from: Z  reason: collision with root package name */
    public Ne.c f33423Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33424h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ t f33425i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f33426j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601f(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33425i0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33424h0 = obj;
        this.f33426j0 |= Integer.MIN_VALUE;
        return this.f33425i0.z(null, this);
    }
}
