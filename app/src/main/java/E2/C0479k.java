package E2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k5.C4175a;
import v2.AbstractC5968g;
import y2.C6530q;

/* renamed from: E2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4367a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4368b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4369c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4370d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4371e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4372f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4373g;

    /* renamed from: h  reason: collision with root package name */
    public Object f4374h;

    public C0479k(String str, String str2, C4175a c4175a) {
        AbstractC3557B.c0("audience", str2);
        this.f4367a = str;
        this.f4368b = str2;
        this.f4369c = c4175a;
    }

    public final w8.l a(int i10) {
        w8.l lVar;
        w8.l c6530q;
        Object obj = this.f4368b;
        if (((Map) obj).containsKey(Integer.valueOf(i10))) {
            return (w8.l) ((Map) obj).get(Integer.valueOf(i10));
        }
        final AbstractC5968g abstractC5968g = (AbstractC5968g) this.f4371e;
        abstractC5968g.getClass();
        w8.l lVar2 = null;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                c6530q = new w8.l() { // from class: E2.j
                                    @Override // w8.l
                                    public final Object get() {
                                        int i11 = r3;
                                        AbstractC5968g abstractC5968g2 = abstractC5968g;
                                        Object obj2 = this;
                                        switch (i11) {
                                            case 0:
                                                return C0481m.d((Class) obj2, abstractC5968g2);
                                            case 1:
                                                return C0481m.d((Class) obj2, abstractC5968g2);
                                            case 2:
                                                return C0481m.d((Class) obj2, abstractC5968g2);
                                            default:
                                                return new P(abstractC5968g2, (L2.t) ((C0479k) obj2).f4367a);
                                        }
                                    }
                                };
                            }
                        } else {
                            c6530q = new C6530q(2, Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(AbstractC0491x.class));
                        }
                        lVar2 = c6530q;
                    } else {
                        final GenericDeclaration asSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(AbstractC0491x.class);
                        lVar = new w8.l() { // from class: E2.j
                            @Override // w8.l
                            public final Object get() {
                                int i11 = r3;
                                AbstractC5968g abstractC5968g2 = abstractC5968g;
                                Object obj2 = asSubclass;
                                switch (i11) {
                                    case 0:
                                        return C0481m.d((Class) obj2, abstractC5968g2);
                                    case 1:
                                        return C0481m.d((Class) obj2, abstractC5968g2);
                                    case 2:
                                        return C0481m.d((Class) obj2, abstractC5968g2);
                                    default:
                                        return new P(abstractC5968g2, (L2.t) ((C0479k) obj2).f4367a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(AbstractC0491x.class);
                    lVar = new w8.l() { // from class: E2.j
                        @Override // w8.l
                        public final Object get() {
                            int i11 = r3;
                            AbstractC5968g abstractC5968g2 = abstractC5968g;
                            Object obj2 = asSubclass2;
                            switch (i11) {
                                case 0:
                                    return C0481m.d((Class) obj2, abstractC5968g2);
                                case 1:
                                    return C0481m.d((Class) obj2, abstractC5968g2);
                                case 2:
                                    return C0481m.d((Class) obj2, abstractC5968g2);
                                default:
                                    return new P(abstractC5968g2, (L2.t) ((C0479k) obj2).f4367a);
                            }
                        }
                    };
                }
                lVar2 = lVar;
            } else {
                final GenericDeclaration asSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(AbstractC0491x.class);
                lVar2 = new w8.l() { // from class: E2.j
                    @Override // w8.l
                    public final Object get() {
                        int i11 = r3;
                        AbstractC5968g abstractC5968g2 = abstractC5968g;
                        Object obj2 = asSubclass3;
                        switch (i11) {
                            case 0:
                                return C0481m.d((Class) obj2, abstractC5968g2);
                            case 1:
                                return C0481m.d((Class) obj2, abstractC5968g2);
                            case 2:
                                return C0481m.d((Class) obj2, abstractC5968g2);
                            default:
                                return new P(abstractC5968g2, (L2.t) ((C0479k) obj2).f4367a);
                        }
                    }
                };
            }
        } catch (ClassNotFoundException unused) {
        }
        ((Map) obj).put(Integer.valueOf(i10), lVar2);
        if (lVar2 != null) {
            ((Set) this.f4370d).add(Integer.valueOf(i10));
        }
        return lVar2;
    }

    public C0479k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(M3.H.l0(R.attr.materialCalendarStyle, context, com.google.android.material.datepicker.k.class.getCanonicalName()).data, O7.a.f13413l);
        this.f4367a = q.r.b(context, obtainStyledAttributes.getResourceId(4, 0));
        this.f4373g = q.r.b(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f4368b = q.r.b(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f4369c = q.r.b(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList L02 = A7.b.L0(context, obtainStyledAttributes, 7);
        this.f4370d = q.r.b(context, obtainStyledAttributes.getResourceId(9, 0));
        this.f4371e = q.r.b(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f4372f = q.r.b(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.f4374h = paint;
        paint.setColor(L02.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    public C0479k(L2.t tVar) {
        this.f4367a = tVar;
        this.f4368b = new HashMap();
        this.f4370d = new HashSet();
        this.f4369c = new HashMap();
    }
}
