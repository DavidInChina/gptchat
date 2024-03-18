package O0;

import Ng.H;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;
import nf.AbstractC4828h;
import z.C6672L;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13317a;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13319c;

    /* renamed from: d  reason: collision with root package name */
    public final Layout f13320d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13321e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13322f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13323g;

    /* renamed from: h  reason: collision with root package name */
    public final float f13324h;

    /* renamed from: i  reason: collision with root package name */
    public final float f13325i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f13326j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint.FontMetricsInt f13327k;

    /* renamed from: l  reason: collision with root package name */
    public final int f13328l;

    /* renamed from: m  reason: collision with root package name */
    public final Q0.h[] f13329m;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC3957g f13331o;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13318b = true;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f13330n = new Rect();

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0175, code lost:
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017a, code lost:
        if (r11 >= 28) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(CharSequence charSequence, float f6, V0.d dVar, int i10, TextUtils.TruncateAt truncateAt, int i11, boolean z10, int i12, int i13, int i14, int i15, int i16, int i17, h hVar) {
        Layout.Alignment alignment;
        boolean z11;
        j jVar;
        Layout layout;
        boolean z12;
        int i18;
        Q0.h[] hVarArr;
        int length;
        int i19;
        int i20;
        int i21;
        long j6;
        int i22;
        Layout layout2;
        Paint.FontMetricsInt fontMetricsInt;
        int i23;
        int i24;
        int i25;
        int topPadding;
        int i26;
        boolean isFallbackLineSpacingEnabled;
        j jVar2;
        Layout layout3;
        this.f13317a = z10;
        int length2 = charSequence.length();
        TextDirectionHeuristic a5 = t.a(i11);
        Layout.Alignment alignment2 = q.f13314a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = q.f13315b;
                        }
                    } else {
                        alignment = q.f13314a;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        Layout.Alignment alignment3 = alignment;
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length2, Q0.a.class) < length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a10 = hVar.a();
            double d10 = f6;
            int ceil = (int) Math.ceil(d10);
            j jVar3 = n.f13292a;
            if (a10 != null && hVar.b() <= f6 && !z11) {
                this.f13326j = true;
                if (ceil >= 0) {
                    if (ceil >= 0) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            jVar2 = jVar3;
                            layout3 = a.a(charSequence, dVar, ceil, alignment3, 1.0f, 0.0f, a10, z10, true, truncateAt, ceil);
                        } else {
                            jVar2 = jVar3;
                            layout3 = b.a(charSequence, dVar, ceil, alignment3, 1.0f, 0.0f, a10, z10, truncateAt, ceil);
                        }
                        layout = layout3;
                        jVar = jVar2;
                    } else {
                        throw new IllegalArgumentException("negative ellipsized width".toString());
                    }
                } else {
                    throw new IllegalArgumentException("negative width".toString());
                }
            } else {
                this.f13326j = false;
                jVar = jVar3;
                layout = jVar.a(new p(1.0f, 0.0f, 0, charSequence.length(), ceil, i12, (int) Math.ceil(d10), i17, i13, i14, i15, i16, alignment3, a5, dVar, truncateAt, charSequence, z10, true, null, null));
            }
            this.f13320d = layout;
            Trace.endSection();
            int min = Math.min(layout.getLineCount(), i12);
            this.f13321e = min;
            int i27 = min - 1;
            if (min < i12 || (layout.getEllipsisCount(i27) <= 0 && layout.getLineEnd(i27) == charSequence.length())) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f13319c = z12;
            long j10 = t.f13333b;
            if (!z10) {
                if (this.f13326j) {
                    isFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layout).isFallbackLineSpacingEnabled() : isFallbackLineSpacingEnabled;
                    TextPaint paint = layout.getPaint();
                    CharSequence text = layout.getText();
                    i18 = 0;
                    Rect N10 = AbstractC4828h.N(paint, text, layout.getLineStart(0), layout.getLineEnd(0));
                    int lineAscent = layout.getLineAscent(0);
                    int i28 = N10.top;
                    if (i28 < lineAscent) {
                        topPadding = lineAscent - i28;
                    } else {
                        topPadding = layout.getTopPadding();
                    }
                    N10 = min != 1 ? AbstractC4828h.N(paint, text, layout.getLineStart(i27), layout.getLineEnd(i27)) : N10;
                    int lineDescent = layout.getLineDescent(i27);
                    int i29 = N10.bottom;
                    if (i29 > lineDescent) {
                        i26 = i29 - lineDescent;
                    } else {
                        i26 = layout.getBottomPadding();
                    }
                    if (topPadding != 0 || i26 != 0) {
                        j10 = (topPadding << 32) | (i26 & 4294967295L);
                    }
                    if (layout.getText() instanceof Spanned) {
                        hVarArr = new Q0.h[i18];
                    } else {
                        CharSequence text2 = layout.getText();
                        AbstractC3557B.a0("null cannot be cast to non-null type android.text.Spanned", text2);
                        hVarArr = (Q0.h[]) ((Spanned) text2).getSpans(i18, layout.getText().length(), Q0.h.class);
                        if (hVarArr.length == 0) {
                            hVarArr = new Q0.h[i18];
                        }
                    }
                    this.f13329m = hVarArr;
                    length = hVarArr.length;
                    i19 = i18;
                    i20 = i19;
                    i21 = i20;
                    while (i20 < length) {
                        Q0.h hVar2 = hVarArr[i20];
                        int i30 = hVar2.f14278k;
                        i19 = i30 < 0 ? Math.max(i19, Math.abs(i30)) : i19;
                        int i31 = hVar2.f14279l;
                        if (i31 < 0) {
                            i21 = Math.max(i19, Math.abs(i31));
                        }
                        i20++;
                    }
                    if (i19 != 0 && i21 == 0) {
                        j6 = t.f13333b;
                    } else {
                        j6 = (i19 << 32) | (i21 & 4294967295L);
                    }
                    this.f13322f = Math.max((int) (j10 >> 32), (int) (j6 >> 32));
                    this.f13323g = Math.max((int) (j10 & 4294967295L), (int) (j6 & 4294967295L));
                    Q0.h[] hVarArr2 = this.f13329m;
                    i22 = this.f13321e - 1;
                    layout2 = this.f13320d;
                    if (layout2.getLineStart(i22) == layout2.getLineEnd(i22)) {
                        if (hVarArr2.length == 0) {
                            i24 = 1;
                        } else {
                            i24 = i18;
                        }
                        if ((1 ^ i24) != 0) {
                            SpannableString spannableString = new SpannableString("\u200b");
                            Q0.h hVar3 = (Q0.h) kf.q.i3(hVarArr2);
                            int length3 = spannableString.length();
                            if (i22 != 0 && hVar3.f14272e) {
                                i25 = i18;
                            } else {
                                i25 = hVar3.f14272e;
                            }
                            spannableString.setSpan(new Q0.h(hVar3.f14268a, length3, i25 == 1 ? 1 : 0, hVar3.f14272e, hVar3.f14273f), i18, spannableString.length(), 33);
                            StaticLayout a11 = jVar.a(new p(1.0f, 0.0f, 0, spannableString.length(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0, 0, e.f13276a, a5, dVar, null, spannableString, this.f13317a, this.f13318b, null, null));
                            fontMetricsInt = new Paint.FontMetricsInt();
                            fontMetricsInt.ascent = a11.getLineAscent(i18);
                            fontMetricsInt.descent = a11.getLineDescent(i18);
                            fontMetricsInt.top = a11.getLineTop(i18);
                            fontMetricsInt.bottom = a11.getLineBottom(i18);
                            if (fontMetricsInt != null) {
                                i23 = fontMetricsInt.bottom - ((int) (d(i27) - f(i27)));
                            } else {
                                i23 = i18;
                            }
                            this.f13328l = i23;
                            this.f13327k = fontMetricsInt;
                            Layout layout4 = this.f13320d;
                            this.f13324h = H.o(layout4, i27, layout4.getPaint());
                            Layout layout5 = this.f13320d;
                            this.f13325i = H.p(layout5, i27, layout5.getPaint());
                            this.f13331o = R4.b.C1(EnumC3958h.f36153Z, new C6672L(27, this));
                        }
                    }
                    fontMetricsInt = null;
                    if (fontMetricsInt != null) {
                    }
                    this.f13328l = i23;
                    this.f13327k = fontMetricsInt;
                    Layout layout42 = this.f13320d;
                    this.f13324h = H.o(layout42, i27, layout42.getPaint());
                    Layout layout52 = this.f13320d;
                    this.f13325i = H.p(layout52, i27, layout52.getPaint());
                    this.f13331o = R4.b.C1(EnumC3958h.f36153Z, new C6672L(27, this));
                }
                StaticLayout staticLayout = (StaticLayout) layout;
                int i32 = Build.VERSION.SDK_INT;
                if (i32 >= 33) {
                    isFallbackLineSpacingEnabled = m.a(staticLayout);
                }
            }
            i18 = 0;
            if (layout.getText() instanceof Spanned) {
            }
            this.f13329m = hVarArr;
            length = hVarArr.length;
            i19 = i18;
            i20 = i19;
            i21 = i20;
            while (i20 < length) {
            }
            if (i19 != 0) {
            }
            j6 = (i19 << 32) | (i21 & 4294967295L);
            this.f13322f = Math.max((int) (j10 >> 32), (int) (j6 >> 32));
            this.f13323g = Math.max((int) (j10 & 4294967295L), (int) (j6 & 4294967295L));
            Q0.h[] hVarArr22 = this.f13329m;
            i22 = this.f13321e - 1;
            layout2 = this.f13320d;
            if (layout2.getLineStart(i22) == layout2.getLineEnd(i22)) {
            }
            fontMetricsInt = null;
            if (fontMetricsInt != null) {
            }
            this.f13328l = i23;
            this.f13327k = fontMetricsInt;
            Layout layout422 = this.f13320d;
            this.f13324h = H.o(layout422, i27, layout422.getPaint());
            Layout layout522 = this.f13320d;
            this.f13325i = H.p(layout522, i27, layout522.getPaint());
            this.f13331o = R4.b.C1(EnumC3958h.f36153Z, new C6672L(27, this));
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        int i10;
        boolean z10 = this.f13319c;
        Layout layout = this.f13320d;
        if (z10) {
            i10 = layout.getLineBottom(this.f13321e - 1);
        } else {
            i10 = layout.getHeight();
        }
        return i10 + this.f13322f + this.f13323g + this.f13328l;
    }

    public final float b(int i10) {
        if (i10 == this.f13321e - 1) {
            return this.f13324h + this.f13325i;
        }
        return 0.0f;
    }

    public final float c(int i10) {
        float f6;
        Paint.FontMetricsInt fontMetricsInt;
        float f10 = this.f13322f;
        if (i10 == this.f13321e - 1 && (fontMetricsInt = this.f13327k) != null) {
            f6 = f(i10) - fontMetricsInt.ascent;
        } else {
            f6 = this.f13320d.getLineBaseline(i10);
        }
        return f10 + f6;
    }

    public final float d(int i10) {
        int i11;
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.f13321e;
        int i13 = i12 - 1;
        Layout layout = this.f13320d;
        if (i10 == i13 && (fontMetricsInt = this.f13327k) != null) {
            return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f13322f + layout.getLineBottom(i10);
        if (i10 == i12 - 1) {
            i11 = this.f13323g;
        } else {
            i11 = 0;
        }
        return lineBottom + i11;
    }

    public final int e(int i10) {
        Layout layout = this.f13320d;
        if (layout.getEllipsisStart(i10) == 0) {
            return layout.getLineEnd(i10);
        }
        return layout.getText().length();
    }

    public final float f(int i10) {
        int i11;
        float lineTop = this.f13320d.getLineTop(i10);
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f13322f;
        }
        return lineTop + i11;
    }

    public final float g(int i10, boolean z10) {
        return b(this.f13320d.getLineForOffset(i10)) + ((g) this.f13331o.getValue()).b(i10, true, z10);
    }

    public final float h(int i10, boolean z10) {
        return b(this.f13320d.getLineForOffset(i10)) + ((g) this.f13331o.getValue()).b(i10, false, z10);
    }
}
