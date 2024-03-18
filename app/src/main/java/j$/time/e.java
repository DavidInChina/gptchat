package j$.time;

import j$.time.temporal.TemporalAccessor;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements j$.time.temporal.t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34964a;

    @Override // j$.time.temporal.t
    public final Object a(TemporalAccessor temporalAccessor) {
        switch (this.f34964a) {
            case 0:
                return LocalDate.P(temporalAccessor);
            case 1:
                return LocalDateTime.O(temporalAccessor);
            default:
                return OffsetDateTime.L(temporalAccessor);
        }
    }
}
