package j$.time.zone;

import j$.time.DateTimeException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes3.dex */
final class h extends i {

    /* renamed from: d  reason: collision with root package name */
    private final Set f35199d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f35199d = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.i
    protected final ZoneRules c(String str) {
        if (this.f35199d.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new DateTimeException("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.i
    protected final Set d() {
        return this.f35199d;
    }
}
