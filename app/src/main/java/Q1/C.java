package Q1;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C extends SpannableStringBuilder {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f14302Y;

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f14303Z = new ArrayList();

    public C(Class cls, CharSequence charSequence) {
        super(charSequence);
        R4.b.U(cls, "watcherClass cannot be null");
        this.f14302Y = cls;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14303Z;
            if (i10 < arrayList.size()) {
                ((B) arrayList.get(i10)).f14301Z.incrementAndGet();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14303Z;
            if (i10 < arrayList.size()) {
                ((B) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
                i10++;
            } else {
                return;
            }
        }
    }

    public final B c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14303Z;
            if (i10 < arrayList.size()) {
                B b10 = (B) arrayList.get(i10);
                if (b10.f14300Y == obj) {
                    return b10;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f14302Y == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f14303Z;
            if (i10 < arrayList.size()) {
                ((B) arrayList.get(i10)).f14301Z.decrementAndGet();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        B c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        B c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        B c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.f14302Y == cls) {
            B[] bArr = (B[]) super.getSpans(i10, i11, B.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, bArr.length);
            for (int i12 = 0; i12 < bArr.length; i12++) {
                objArr[i12] = bArr[i12].f14300Y;
            }
            return objArr;
        }
        return super.getSpans(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.f14302Y == cls) {
            cls = B.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        B b10;
        if (d(obj)) {
            b10 = c(obj);
            if (b10 != null) {
                obj = b10;
            }
        } else {
            b10 = null;
        }
        super.removeSpan(obj);
        if (b10 != null) {
            this.f14303Z.remove(b10);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            B b10 = new B(obj);
            this.f14303Z.add(b10);
            obj = b10;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new C(this.f14302Y, this, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo26append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder mo31delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo32insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo29append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder mo33insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    public C(Class cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        R4.b.U(cls, "watcherClass cannot be null");
        this.f14302Y = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo25append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo28append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder mo27append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* renamed from: append  reason: collision with other method in class */
    public final Appendable mo30append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }
}
