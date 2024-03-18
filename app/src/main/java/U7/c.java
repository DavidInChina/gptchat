package U7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s1.AbstractC5521c;
import w3.AbstractC6093I;

/* loaded from: classes2.dex */
public final class c extends AbstractC6093I {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f17507a;

    /* renamed from: b  reason: collision with root package name */
    public final List f17508b = Collections.unmodifiableList(new ArrayList());

    public c() {
        Paint paint = new Paint();
        this.f17507a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // w3.AbstractC6093I
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f17507a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (e eVar : this.f17508b) {
            eVar.getClass();
            ThreadLocal threadLocal = AbstractC5521c.f45104a;
            float f6 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f6)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f6)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f6)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f6))));
            int i10 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                d dVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f27098p;
                switch (dVar.f17509h0) {
                    case 0:
                        break;
                    default:
                        i10 = dVar.f17510i0.E();
                        break;
                }
                eVar.getClass();
                canvas.drawLine(0.0f, i10, 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f27098p.i(), paint);
            } else {
                d dVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f27098p;
                switch (dVar2.f17509h0) {
                    case 0:
                        i10 = dVar2.f17510i0.C();
                        break;
                }
                eVar.getClass();
                canvas.drawLine(i10, 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f27098p.j(), 0.0f, paint);
            }
        }
    }
}
