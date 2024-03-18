package io.ktor.websocket;

import Ng.E;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final E f33700a = new E("ws-ponger");

    /* renamed from: b  reason: collision with root package name */
    public static final E f33701b = new E("ws-pinger");
} root package name */
    public final /* synthetic */ p f29873b;

    public /* synthetic */ C2963o(p pVar, int i10) {
        this.f29872a = i10;
        this.f29873b = pVar;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29872a;
        p pVar = this.f29873b;
        switch (i10) {
            case 0:
                return new v(pVar.f29898b);
            default:
                return new x(pVar.f29898b);
        }
    }
}
