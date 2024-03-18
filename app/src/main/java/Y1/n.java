package y1;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f50331a;

    public n(Object obj) {
        this.f50331a = livekit.org.webrtc.audio.a.j(obj);
    }

    @Override // y1.m
    public final String a() {
        String languageTags;
        languageTags = this.f50331a.toLanguageTags();
        return languageTags;
    }

    @Override // y1.m
    public final Object b() {
        return this.f50331a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f50331a.equals(((m) obj).b());
        return equals;
    }

    @Override // y1.m
    public final Locale get(int i10) {
        Locale locale;
        locale = this.f50331a.get(i10);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f50331a.hashCode();
        return hashCode;
    }

    @Override // y1.m
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f50331a.isEmpty();
        return isEmpty;
    }

    @Override // y1.m
    public final int size() {
        int size;
        size = this.f50331a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f50331a.toString();
        return localeList;
    }
}
