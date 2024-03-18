package d6;

import kotlin.jvm.internal.o;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f28005Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f28006h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f28007i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f28008j0 = new a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28009Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(0);
        this.f28009Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        switch (this.f28009Y) {
            case 0:
                return "Cannot read application, session, view IDs data from view event.";
            case 1:
                return "Error while trying to read the NDK crash directory";
            case 2:
                return "Logs feature is not registered, won't report NDK crash info as log.";
            default:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
        }
    }
}
