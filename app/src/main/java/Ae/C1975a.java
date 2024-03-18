package ae;

import android.content.res.Resources;
import be.j;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import zc.C6821H;

/* renamed from: ae.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1975a extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1975a f24155Z = new C1975a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1975a f24156h0 = new C1975a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24157Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1975a(int i10) {
        super(0);
        this.f24157Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Field field;
        switch (this.f24157Y) {
            case 0:
                be.g gVar = new be.g();
                C6821H c6821h = new C6821H(7, gVar);
                try {
                    Object value = j.f25968b.getValue();
                    if (value != null && (field = (Field) j.f25969c.getValue()) != null) {
                        Object obj = field.get(value);
                        if (obj != null) {
                            field.set(value, c6821h.invoke((ArrayList) obj));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC3612c.t("WindowManagerSpy", th2);
                }
                return gVar;
            default:
                try {
                    return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", "android"));
                } catch (Resources.NotFoundException unused) {
                    return "Tooltip";
                }
        }
    }
}
