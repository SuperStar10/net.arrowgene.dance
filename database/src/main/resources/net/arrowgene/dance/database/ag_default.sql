INSERT INTO `ag_channel` (`channel_id`, `channel_typ`, `channel_position`, `channel_name`) VALUES
  (1, 0, 0, 'Berlin'),
  (2, 0, 1, 'Rostock'),
  (3, 0, 2, 'Frankfurt'),
  (4, 1, 0, 'Paris'),
  (5, 1, 1, 'Lyon'),
  (6, 1, 2, 'Marseille'),
  (7, 5, 0, 'Deutschland-Tour'),
  (8, 5, 1, 'Frankreich-Tour');


INSERT INTO `ag_user` (`user_id`, `user_account`, `user_password`, `user_state`, `user_active_character_id`) VALUES
  (100, 'demo' , '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (101, 'demo1', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (102, 'demo2', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (103, 'demo3' , '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (104, 'demo4', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (105, 'demo5', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (106, 'demo6' , '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (107, 'demo7', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (108, 'demo8', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (109, 'demo9', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (110, 'demo10' , '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (111, 'demo11', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (112, 'demo12', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (113, 'demo13', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (114, 'demo14' , '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (115, 'demo15', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (116, 'demo16', '098f6bcd4621d373cade4e832627b4f6', 20, null),
  (117, 'demo17', '098f6bcd4621d373cade4e832627b4f6', 20, null);

INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (100,100, 'demo', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (101,101, 'demo1', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (102,102, 'demo2', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (103,103, 'demo3', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (104,104, 'demo4', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (105,105, 'demo5', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (106,106, 'demo6', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (107,107, 'demo7', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (108,108, 'demo8', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (109,109, 'demo9', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (110,110, 'demo10', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (111,111, 'demo11', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (112,112, 'demo12', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (113,113, 'demo13', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (114,114, 'demo14', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (115,115, 'demo15', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (116,116, 'demo16', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);
INSERT INTO ag_character (character_id, user_id, character_name, character_level, character_sex, character_flag, character_hair, character_glasses, character_top, character_shoes, character_face, character_gloves, character_pants, character_experience, character_games, character_wins, character_draws, character_losses, character_hearts, character_mvp, character_perfects, character_cools, character_bads, character_misses, character_points, character_coins, character_bonus, character_weight, character_ranking, character_status_achieved, character_best_score, character_age, character_zodiac, character_city, character_calorins_lost_week, character_points_won, character_competition_win, character_competition_lost, character_medal, character_alltime_best_ranking, character_tutorial, character_info, character_item_slot_count, character_cloth_slot_count) VALUES (117,117, 'demo17', 1, 1, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, '', '', 0, 0, 0, 0, 0, 0, 0, '', 8, 8);


UPDATE ag_user SET user_active_character_id=100 WHERE user_id=100;
UPDATE ag_user SET user_active_character_id=101 WHERE user_id=101;
UPDATE ag_user SET user_active_character_id=102 WHERE user_id=102;
UPDATE ag_user SET user_active_character_id=103 WHERE user_id=103;
UPDATE ag_user SET user_active_character_id=104 WHERE user_id=104;
UPDATE ag_user SET user_active_character_id=105 WHERE user_id=105;
UPDATE ag_user SET user_active_character_id=106 WHERE user_id=106;
UPDATE ag_user SET user_active_character_id=107 WHERE user_id=107;
UPDATE ag_user SET user_active_character_id=108 WHERE user_id=108;
UPDATE ag_user SET user_active_character_id=109 WHERE user_id=109;
UPDATE ag_user SET user_active_character_id=110 WHERE user_id=110;
UPDATE ag_user SET user_active_character_id=111 WHERE user_id=111;
UPDATE ag_user SET user_active_character_id=112 WHERE user_id=112;
UPDATE ag_user SET user_active_character_id=113 WHERE user_id=113;
UPDATE ag_user SET user_active_character_id=114 WHERE user_id=114;
UPDATE ag_user SET user_active_character_id=115 WHERE user_id=115;
UPDATE ag_user SET user_active_character_id=116 WHERE user_id=116;
UPDATE ag_user SET user_active_character_id=117 WHERE user_id=117;