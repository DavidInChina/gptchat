package q;

import android.content.Context;
import android.view.View;
import com.openai.chatgpt.R;

/* renamed from: q.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5212h extends p.A {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f43431m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C5222m f43432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5212h(C5222m c5222m, Context context, p.o oVar, C5220l c5220l) {
        super(R.attr.actionOverflowMenuStyle, 0, context, c5220l, oVar, true);
        this.f43432n = c5222m;
        this.f41503g = 8388613;
        J0.a aVar = c5222m.f43452B0;
        this.f41505i = aVar;
        p.x xVar = this.f41506j;
        if (xVar != null) {
            xVar.e(aVar);
        }
    }

    @Override // p.A
    public final void c() {
        int i10 = this.f43431m;
        C5222m c5222m = this.f43432n;
        switch (i10) {
            case 0:
                c5222m.f43472y0 = null;
                super.c();
                return;
            default:
                p.o oVar = c5222m.f43455h0;
                if (oVar != null) {
                    oVar.c(true);
                }
                c5222m.f43471x0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5212h(C5222m c5222m, Context context, p.I i10, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, i10, false);
        this.f43432n = c5222m;
        if (!i10.f41530A.f()) {
            View view2 = c5222m.f43461n0;
            this.f41502f = view2 == null ? (View) c5222m.f43460m0 : view2;
        }
        J0.a aVar = c5222m.f43452B0;
        this.f41505i = aVar;
        p.x xVar = this.f41506j;
        if (xVar != null) {
            xVar.e(aVar);
        }
    }
}
