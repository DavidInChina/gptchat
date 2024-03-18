package O0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* renamed from: Y  reason: collision with root package name */
    public final CharSequence f13269Y;

    /* renamed from: h0  reason: collision with root package name */
    public final int f13271h0;

    /* renamed from: Z  reason: collision with root package name */
    public final int f13270Z = 0;

    /* renamed from: i0  reason: collision with root package name */
    public int f13272i0 = 0;

    public c(int i10, CharSequence charSequence) {
        this.f13269Y = charSequence;
        this.f13271h0 = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f13272i0;
        if (i10 == this.f13271h0) {
            return '\uffff';
        }
        return this.f13269Y.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f13272i0 = this.f13270Z;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f13270Z;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f13271h0;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f13272i0;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f13270Z;
        int i11 = this.f13271h0;
        if (i10 == i11) {
            this.f13272i0 = i11;
            return '\uffff';
        }
        int i12 = i11 - 1;
        this.f13272i0 = i12;
        return this.f13269Y.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f13272i0 + 1;
        this.f13272i0 = i10;
        int i11 = this.f13271h0;
        if (i10 >= i11) {
            this.f13272i0 = i11;
            return '\uffff';
        }
        return this.f13269Y.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f13272i0;
        if (i10 <= this.f13270Z) {
            return '\uffff';
        }
        int i11 = i10 - 1;
        this.f13272i0 = i11;
        return this.f13269Y.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 <= this.f13271h0 && this.f13270Z <= i10) {
            this.f13272i0 = i10;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
