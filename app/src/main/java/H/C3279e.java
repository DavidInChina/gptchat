package h;

import java.util.UUID;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: h.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3279e extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3279e f31656Z = new C3279e(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3279e f31657h0 = new C3279e(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3279e f31658i0 = new C3279e(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31659Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3279e(int i10) {
        super(0);
        this.f31659Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f31659Y) {
            case 0:
                return UUID.randomUUID().toString();
            default:
                return null;
        }
    }
}
