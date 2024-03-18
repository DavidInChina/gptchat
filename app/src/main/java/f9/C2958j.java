package f9;

import android.app.Application;
import android.content.res.Resources;
import id.AbstractC3557B;
import java.util.Arrays;

/* renamed from: f9.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2958j implements p9.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29793a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29794b;

    public /* synthetic */ C2958j(int i10, Object obj) {
        this.f29793a = i10;
        this.f29794b = obj;
    }

    public final String a(int i10) {
        int i11 = this.f29793a;
        Object obj = this.f29794b;
        switch (i11) {
            case 0:
                String string = ((Application) obj).getString(i10);
                AbstractC3557B.b0("getString(...)", string);
                return string;
            default:
                String string2 = ((Resources) obj).getString(i10);
                AbstractC3557B.b0("getString(...)", string2);
                return string2;
        }
    }

    public final String b(int i10, Object... objArr) {
        int i11 = this.f29793a;
        Object obj = this.f29794b;
        switch (i11) {
            case 0:
                String string = ((Application) obj).getString(i10, Arrays.copyOf(objArr, objArr.length));
                AbstractC3557B.b0("getString(...)", string);
                return string;
            default:
                String string2 = ((Resources) obj).getString(i10, Arrays.copyOf(objArr, objArr.length));
                AbstractC3557B.b0("getString(...)", string2);
                return string2;
        }
    }
}
