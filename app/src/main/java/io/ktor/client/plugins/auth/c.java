package io.ktor.client.plugins.auth;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class c extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final c f33333Z = new c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final c f33334h0 = new c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final c f33335i0 = new c(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final c f33336j0 = new c(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f33337Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f33337Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        int i10 = this.f33337Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return new LinkedHashMap();
                    default:
                        return new LinkedHashMap();
                }
            case 1:
                switch (i10) {
                    case 1:
                        return new a();
                    default:
                        return new a();
                }
            case 2:
                switch (i10) {
                    case 0:
                        return new LinkedHashMap();
                    default:
                        return new LinkedHashMap();
                }
            default:
                switch (i10) {
                    case 1:
                        return new a();
                    default:
                        return new a();
                }
        }
    }
}
