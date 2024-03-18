package jh;

import com.google.protobuf.AbstractC2515j0;

/* renamed from: jh.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4077t implements AbstractC2515j0 {
    ROOM_CREATED(0),
    ROOM_ENDED(1),
    PARTICIPANT_JOINED(2),
    PARTICIPANT_LEFT(3),
    TRACK_PUBLISHED(4),
    TRACK_PUBLISH_REQUESTED(20),
    TRACK_UNPUBLISHED(5),
    TRACK_SUBSCRIBED(6),
    TRACK_SUBSCRIBE_REQUESTED(21),
    TRACK_SUBSCRIBE_FAILED(25),
    TRACK_UNSUBSCRIBED(7),
    TRACK_PUBLISHED_UPDATE(10),
    TRACK_MUTED(23),
    TRACK_UNMUTED(24),
    TRACK_PUBLISH_STATS(26),
    TRACK_SUBSCRIBE_STATS(27),
    PARTICIPANT_ACTIVE(11),
    PARTICIPANT_RESUMED(22),
    EGRESS_STARTED(12),
    EGRESS_ENDED(13),
    EGRESS_UPDATED(28),
    TRACK_MAX_SUBSCRIBED_VIDEO_QUALITY(14),
    RECONNECTED(15),
    INGRESS_CREATED(18),
    INGRESS_DELETED(19),
    INGRESS_STARTED(16),
    INGRESS_ENDED(17),
    INGRESS_UPDATED(29),
    UNRECOGNIZED(-1);
    

    /* renamed from: Y  reason: collision with root package name */
    public final int f36623Y;

    EnumC4077t(int i10) {
        this.f36623Y = i10;
    }

    public static EnumC4077t b(int i10) {
        switch (i10) {
            case 0:
                return ROOM_CREATED;
            case 1:
                return ROOM_ENDED;
            case 2:
                return PARTICIPANT_JOINED;
            case 3:
                return PARTICIPANT_LEFT;
            case 4:
                return TRACK_PUBLISHED;
            case 5:
                return TRACK_UNPUBLISHED;
            case 6:
                return TRACK_SUBSCRIBED;
            case 7:
                return TRACK_UNSUBSCRIBED;
            case 8:
            case 9:
            default:
                return null;
            case 10:
                return TRACK_PUBLISHED_UPDATE;
            case 11:
                return PARTICIPANT_ACTIVE;
            case 12:
                return EGRESS_STARTED;
            case 13:
                return EGRESS_ENDED;
            case 14:
                return TRACK_MAX_SUBSCRIBED_VIDEO_QUALITY;
            case 15:
                return RECONNECTED;
            case 16:
                return INGRESS_STARTED;
            case 17:
                return INGRESS_ENDED;
            case 18:
                return INGRESS_CREATED;
            case 19:
                return INGRESS_DELETED;
            case 20:
                return TRACK_PUBLISH_REQUESTED;
            case 21:
                return TRACK_SUBSCRIBE_REQUESTED;
            case 22:
                return PARTICIPANT_RESUMED;
            case 23:
                return TRACK_MUTED;
            case 24:
                return TRACK_UNMUTED;
            case 25:
                return TRACK_SUBSCRIBE_FAILED;
            case 26:
                return TRACK_PUBLISH_STATS;
            case 27:
                return TRACK_SUBSCRIBE_STATS;
            case 28:
                return EGRESS_UPDATED;
            case 29:
                return INGRESS_UPDATED;
        }
    }

    @Override // com.google.protobuf.AbstractC2515j0
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f36623Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
