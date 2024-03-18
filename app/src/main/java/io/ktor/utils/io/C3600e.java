package io.ktor.utils.io;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: io.ktor.utils.io.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3600e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public t f33415Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f33416Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33417h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33418i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f33419j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ t f33420k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33421l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3600e(t tVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33420k0 = tVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33419j0 = obj;
        this.f33421l0 |= Integer.MIN_VALUE;
        return this.f33420k0.A(null, 0, 0, this);
    }
}
