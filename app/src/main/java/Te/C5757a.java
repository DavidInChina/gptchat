package te;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* renamed from: te.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5757a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5757a f46116Z = new C5757a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5757a f46117h0 = new C5757a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46118Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5757a(int i10) {
        super(0);
        this.f46118Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f46118Y) {
            case 0:
                return r.f.b();
            default:
                return new LinkedHashMap();
        }
    }
}
