package e8;

import android.graphics.Paint;
import android.graphics.Path;
import s1.AbstractC5521c;

/* renamed from: e8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2807a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f29031i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f29032j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f29033k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f29034l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f29035a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f29036b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f29037c;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f29042h;

    /* renamed from: g  reason: collision with root package name */
    public final Path f29041g = new Path();

    /* renamed from: d  reason: collision with root package name */
    public int f29038d = AbstractC5521c.d(-16777216, 68);

    /* renamed from: e  reason: collision with root package name */
    public int f29039e = AbstractC5521c.d(-16777216, 20);

    /* renamed from: f  reason: collision with root package name */
    public int f29040f = AbstractC5521c.d(-16777216, 0);

    public C2807a() {
        Paint paint = new Paint();
        this.f29042h = paint;
        Paint paint2 = new Paint();
        this.f29035a = paint2;
        paint2.setColor(this.f29038d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f29036b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f29037c = new Paint(paint3);
    }
}
