package Z7;

import M3.H;
import android.content.Context;
import com.openai.chatgpt.R;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f23230f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23231a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23232b;

    /* renamed from: c  reason: collision with root package name */
    public final int f23233c;

    /* renamed from: d  reason: collision with root package name */
    public final int f23234d;

    /* renamed from: e  reason: collision with root package name */
    public final float f23235e;

    public a(Context context) {
        boolean k02 = H.k0(context, R.attr.elevationOverlayEnabled, false);
        int Q = P4.a.Q(context, R.attr.elevationOverlayColor, 0);
        int Q10 = P4.a.Q(context, R.attr.elevationOverlayAccentColor, 0);
        int Q11 = P4.a.Q(context, R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f23231a = k02;
        this.f23232b = Q;
        this.f23233c = Q10;
        this.f23234d = Q11;
        this.f23235e = f6;
    }
}
